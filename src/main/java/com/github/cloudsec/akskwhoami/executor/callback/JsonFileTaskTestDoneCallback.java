package com.github.cloudsec.akskwhoami.executor.callback;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.domain.TestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 * @author CC11001100
 */
public class JsonFileTaskTestDoneCallback implements TaskTestDoneCallback {

    @Override
    public void apply(TestTask task, ServiceProvider serviceProvider, TestResult result, Exception e) {
        // TODO
    }

}
