package com.github.cloudsec.akskwhoami.executor.base;

import com.github.cloudsec.akskwhoami.executor.event.TaskTestEventListener;
import com.github.cloudsec.akskwhoami.executor.selector.ServiceProviderSelector;
import com.github.cloudsec.akskwhoami.service.task.TestTask;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 执行测试任务的执行器接口定义
 *
 * @author CC11001100
 */
public interface TestTaskExecutor extends ExecutorService {

    /**
     * 用于监听任务的执行进度，在任务被执行到关键节点的时候会触发回调
     *
     * @param listeners
     */
    void setListeners(List<TaskTestEventListener> listeners);

    /**
     * 设置选择器
     *
     * @param selector
     */
    void setSelector(ServiceProviderSelector selector);

    /**
     * 同步执行测试任务，注意此方法是阻塞式的，直到任务执行完毕（成功或失败）此方法才会结束
     *
     * @param task
     * @throws TestTaskExecuteException
     */
    void execute(TestTask task) throws TestTaskExecuteException;

    /**
     * 不再往任务队列中
     */
    void shutdown();

    /**
     *
     */
    boolean awaitTermination(long timeout, TimeUnit unit)
            throws InterruptedException;

}
