package com.github.cloudsec.akskwhoami.service.impl.jdcloud;

import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 *
 * https://docs.jdcloud.com/cn/sdk/java
 *
 * @author CC11001100
 */
public class JdCloudOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {
        // TODO 对接java sdk
        return null;
    }

}
