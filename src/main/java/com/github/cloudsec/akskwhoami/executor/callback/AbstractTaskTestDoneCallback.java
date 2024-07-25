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
     * @param task
     * @param serviceProvider
     * @param result
     */
    public abstract void processExecuteSuccess(TestTask task, ServiceProvider serviceProvider, TestResult result);

    /**
     * @param task
     * @param serviceProvider
     * @param e
     */
    public abstract void processExecuteException(TestTask task, ServiceProvider serviceProvider, Exception e);

}
