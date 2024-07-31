package com.github.cloudsec.akskwhoami.executor.concurrency;

import com.github.cloudsec.akskwhoami.executor.base.TestTaskExecuteException;
import com.github.cloudsec.akskwhoami.executor.base.TestTaskExecutor;
import com.github.cloudsec.akskwhoami.executor.callback.TaskTestDoneCallback;
import com.github.cloudsec.akskwhoami.executor.callback.TerminalShowTaskTestDoneCallback;
import com.github.cloudsec.akskwhoami.executor.selector.AllServiceProviderSelector;
import com.github.cloudsec.akskwhoami.executor.selector.ServiceProviderSelector;
import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.domain.TestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;
import lombok.Data;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 并发执行测试任务的执行器
 *
 * @author CC11001100
 */
@Data
public class ConcurrencyTestTaskExecutor implements TestTaskExecutor {

    /**
     * 默认选择所有服务厂商都测试一遍
     */
    public static final ServiceProviderSelector DEFAULT_SELECTOR = new AllServiceProviderSelector();

    /**
     * 默认把测试结果打印在控制台上
     */
    public static final TaskTestDoneCallback DEFAULT_TASK_TEST_DONE_CALLBACK = new TerminalShowTaskTestDoneCallback();

    /**
     * 默认的并发数大一些，看看用户的机器够不够遭不遭得住啊哈哈哈哈
     */
    public static final int DEFAULT_THREAD_NUM = 1000;

    /**
     * 默认执行器的超时时间
     */
    public static final long DEFAULT_TIMEOUT = 1000 * 60 * 60 * 30;

    /**
     * 要被测试的任务
     */
    private TestTask task;

    /**
     * 选择使用哪些服务商来测试
     */
    private ServiceProviderSelector selector = DEFAULT_SELECTOR;

    /**
     * 每执行完一次就回调一次此函数处理结果
     */
    private TaskTestDoneCallback taskTestDoneCallback = DEFAULT_TASK_TEST_DONE_CALLBACK;

    /**
     * 是否要关闭进度条展示，默认是不关闭的
     */
    private boolean disableProgressBar;

    /**
     * 要在命令行上展示的进度条
     */
    private TaskExecutorProgressBar progressBar;

    /**
     * 执行时要使用的线程并发数
     */
    private int threadNum = DEFAULT_THREAD_NUM;

    /**
     * 执行超时时间
     */
    private long timeoutMils = DEFAULT_TIMEOUT;

    @Override
    public void execute(TestTask task) throws TestTaskExecuteException {

        // 为任务选择要使用哪些服务商来测试
        List<ServiceProvider> serviceProviderList = this.selector.select(task);
        if (serviceProviderList == null || serviceProviderList.isEmpty()) {
            throw new TestTaskExecuteException("No service providers found for the task to be tested.");
        }

        // 初始化命令行进度条，如果需要的话
        if (!this.disableProgressBar) {
            this.progressBar = new TaskExecutorProgressBar("AkSk Test Task", serviceProviderList.size());
            this.progressBar.refresh();
        }

        // 开始提交测试任务开始测试，每个服务商会提交一个测试任务
        ExecutorService executorService = Executors.newFixedThreadPool(this.threadNum);
        for (ServiceProvider serviceProvider : serviceProviderList) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        TestResult result = serviceProvider.test(task);
                        taskTestDoneCallback.apply(task, serviceProvider, result, null);
                    } catch (Exception e) {
                        taskTestDoneCallback.apply(task, serviceProvider, null, e);
                    } finally {
                        if (!disableProgressBar) {
                            progressBar.done();
                        }
                    }
                }
            });
        }
        try {
            executorService.shutdown();
            executorService.awaitTermination(timeoutMils, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new TestTaskExecuteException(e);
        }
    }

}
