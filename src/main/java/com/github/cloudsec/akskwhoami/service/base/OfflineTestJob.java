package com.github.cloudsec.akskwhoami.service.base;

import com.github.cloudsec.akskwhoami.service.domain.OfflineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 *
 * 离线测试任务执行器
 *
 * @author CC11001100
 */
@FunctionalInterface
public interface OfflineTestJob {

    /**
     * 执行离线测试，只会返回一个结果
     *
     * @param task
     * @return
     * @throws ServiceProviderTestException
     */
    OfflineTestResult execute(TestTask task) throws ServiceProviderTestException;

}
