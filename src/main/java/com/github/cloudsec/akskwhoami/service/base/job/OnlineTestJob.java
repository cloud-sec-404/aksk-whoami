package com.github.cloudsec.akskwhoami.service.base.job;

import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 *
 * 联网测试任务执行器
 *
 * @author CC11001100
 */
@FunctionalInterface
public interface OnlineTestJob {

    /**
     * 执行联网测试，只会返回一个结果
     *
     * @param task
     * @return
     * @throws ServiceProviderTestException
     */
    OnlineTestResult execute(TestTask task) throws ServiceProviderTestException;

}
