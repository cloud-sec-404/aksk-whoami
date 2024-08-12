package com.github.cloudsec.akskwhoami.executor.concurrency;

import com.github.cloudsec.akskwhoami.executor.base.TestTaskExecuteException;
import com.github.cloudsec.akskwhoami.executor.base.TestTaskExecutor;
import com.github.cloudsec.akskwhoami.executor.event.TaskTestEventListener;
import com.github.cloudsec.akskwhoami.executor.selector.AllServiceProviderSelector;
import com.github.cloudsec.akskwhoami.executor.selector.ServiceProviderSelector;
import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 并发执行测试任务的执行器
 *
 * @author CC11001100
 */
public class ConcurrencyTestTaskExecutor extends ThreadPoolExecutor implements TestTaskExecutor {

    /**
     * 默认选择所有服务厂商都测试一遍
     */
    public static final ServiceProviderSelector DEFAULT_SELECTOR = new AllServiceProviderSelector();

    /**
     * 默认的并发数大一些，看看用户的机器够不够遭不遭得住啊哈哈哈哈
     */
    public static final int DEFAULT_THREAD_NUM = 100;

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
    @Getter
    @Setter
    private ServiceProviderSelector selector = DEFAULT_SELECTOR;

    /**
     * 每执行完一次就回调一次此函数处理结果
     */
    @Getter
    @Setter
    private List<TaskTestEventListener> listeners = new ArrayList<>();

    public ConcurrencyTestTaskExecutor() {
        super(4, 100, 1, TimeUnit.MINUTES, new LinkedBlockingQueue<>());
    }


    public ConcurrencyTestTaskExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    @Override
    public void setListeners(List<TaskTestEventListener> listeners) {
        this.listeners = listeners;
    }

    @Override
    public void execute(TestTask task) throws TestTaskExecuteException {

        // 有新任务被提交
        if (CollectionUtils.isNotEmpty(this.listeners)) {
            for (TaskTestEventListener listener : this.listeners) {
                listener.onSubmit(task);
            }
        }

        // 为任务选择要使用哪些服务商来测试
        List<ServiceProvider> serviceProviderList = this.selector.select(task);
        if (CollectionUtils.isEmpty(serviceProviderList)) {
            throw new TestTaskExecuteException("No service providers found for the task to be tested.");
        }
        // 触发事件回调
        if (CollectionUtils.isNotEmpty(this.listeners)) {
            for (TaskTestEventListener listener : this.listeners) {
                listener.onTestTaskSelector(task, serviceProviderList);
            }
        }

//        // 初始化命令行进度条，如果需要的话
//        if (!this.disableProgressBar) {
//            this.progressBar = new TaskExecutorProgressBar("AkSk Test Task", serviceProviderList.size());
//            this.progressBar.refresh();
//        }

        // 开始提交测试任务开始测试，每个服务商会提交一个测试任务
        for (ServiceProvider serviceProvider : serviceProviderList) {
            super.execute(new TestTaskRunnable(task, serviceProvider, this.listeners));
        }
    }

}
