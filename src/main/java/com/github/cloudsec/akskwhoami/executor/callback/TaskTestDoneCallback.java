package com.github.cloudsec.akskwhoami.executor.callback;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.domain.TestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 *
 * 任务测试完一个服务商之后会触发此回调
 *
 * @author CC11001100
 */
@FunctionalInterface
public interface TaskTestDoneCallback {

    /**
     *
     *
     * @param task
     * @param serviceProvider
     * @param result
     * @param e
     */
    void apply(TestTask task, ServiceProvider serviceProvider, TestResult result, Exception e);

}
