package com.github.cloudsec.akskwhoami.executor.callback;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.domain.TestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 *
 * TODO 把测试的结果通过webhook发送
 *
 * @author CC11001100
 */
public class WebHookTaskTestDoneCallback extends AbstractTaskTestDoneCallback {

    @Override
    public void processExecuteSuccess(TestTask task, ServiceProvider serviceProvider, TestResult result) {

    }

    @Override
    public void processExecuteException(TestTask task, ServiceProvider serviceProvider, Exception e) {

    }

}
