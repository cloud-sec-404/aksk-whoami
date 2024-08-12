package com.github.cloudsec.akskwhoami.executor.event;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.result.TestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;

/**
 *
 * TODO 把测试的结果通过webhook发送
 *
 * @author CC11001100
 */
public class WebHookTaskTestEventListener extends AbstractTaskTestEventListener {

    @Override
    public void processSingleExecuteSuccess(TestTask task, ServiceProvider serviceProvider, TestResult result) {

    }

    @Override
    public void processSingleExecuteException(TestTask task, ServiceProvider serviceProvider, Exception e) {

    }

}
