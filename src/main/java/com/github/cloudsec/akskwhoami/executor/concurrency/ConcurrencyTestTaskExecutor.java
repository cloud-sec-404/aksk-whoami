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
 * @author CC11001100
 */
@Data
public class ConcurrencyTestTaskExecutor implements TestTaskExecutor {

    /**
     * 默认选择所有服务厂商
     */
    public static final ServiceProviderSelector DEFAULT_SELECTOR = new AllServiceProviderSelector();

    /**
     * 默认把结果打印在控制台上
     */
    public static final TaskTestDoneCallback DEFAULT_TASK_TEST_DONE_CALLBACK = new TerminalShowTaskTestDoneCallback();

    /**
     * 看看你的机器够不够遭不遭得住啊哈哈哈哈
     */
    public static final int DEFAULT_THREAD_NUM = 1000;

    /**
     *
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
     * 要在命令行上展示的进度条
     */
    private TaskExecutorProgressBar progressBar;

    /**
     * 执行时要使用的并发数
     */
    private int threadNum = DEFAULT_THREAD_NUM;

    /**
     * 执行超时时间
     */
    private long timeoutMils = DEFAULT_TIMEOUT;

    @Override
    public void execute(TestTask task) throws TestTaskExecuteException {

        List<ServiceProvider> serviceProviderList = this.selector.select(task);
        if (serviceProviderList == null || serviceProviderList.isEmpty()) {
            throw new TestTaskExecuteException("No service providers found for the task to be tested.");
        }

        this.progressBar = new TaskExecutorProgressBar("AkSk Test Task", serviceProviderList.size());
        this.progressBar.refresh();

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
                        progressBar.done();
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
