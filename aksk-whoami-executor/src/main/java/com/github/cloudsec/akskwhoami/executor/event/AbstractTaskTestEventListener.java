package com.github.cloudsec.akskwhoami.executor.event;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.result.TestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;

import java.util.List;

/**
 *
 * 适配器，仅用于缓冲
 *
 * @author CC11001100
 */
public abstract class AbstractTaskTestEventListener implements TaskTestEventListener {

    @Override
    public void onSubmit(TestTask task) {

    }

    @Override
    public void onTestTaskSelector(TestTask task, List<ServiceProvider> serviceProviderList) {

    }

    @Override
    public void onSingleServiceProviderDone(TestTask task, ServiceProvider serviceProvider, TestResult result, Exception e) {
        if (e != null) {
            this.processSingleExecuteException(task, serviceProvider, e);
        } else {
            this.processSingleExecuteSuccess(task, serviceProvider, result);
        }
    }

    /**
     * 测试任务执行成功时的回调方法
     *
     * @param task
     * @param serviceProvider
     * @param result
     */
    public void processSingleExecuteSuccess(TestTask task, ServiceProvider serviceProvider, TestResult result) {

    }

    /**
     * 执行测试任务时发生了异常，会回调此方法
     *
     * @param task
     * @param serviceProvider
     * @param e
     */
    public void processSingleExecuteException(TestTask task, ServiceProvider serviceProvider, Exception e) {

    }

}
