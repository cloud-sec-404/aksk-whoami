package com.github.cloudsec.akskwhoami.executor.callback;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.domain.TestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 * @author CC11001100
 */
public abstract class AbstractTaskTestDoneCallback implements TaskTestDoneCallback {

    @Override
    public void apply(TestTask task, ServiceProvider serviceProvider, TestResult result, Exception e) {
        if (e != null) {
            this.processExecuteException(task, serviceProvider, e);
        } else {
            this.processExecuteSuccess(task, serviceProvider, result);
        }
    }

    /**
     *
     *  测试任务执行成功时的回调方法
     *
     * @param task
     * @param serviceProvider
     * @param result
     */
    public abstract void processExecuteSuccess(TestTask task, ServiceProvider serviceProvider, TestResult result);

    /**
     *
     * 执行测试任务时发生了异常，会回调此方法
     *
     * @param task
     * @param serviceProvider
     * @param e
     */
    public abstract void processExecuteException(TestTask task, ServiceProvider serviceProvider, Exception e);

}
