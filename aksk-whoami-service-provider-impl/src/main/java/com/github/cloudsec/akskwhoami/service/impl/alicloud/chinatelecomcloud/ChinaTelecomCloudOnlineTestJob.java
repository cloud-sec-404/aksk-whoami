package com.github.cloudsec.akskwhoami.service.impl.alicloud.chinatelecomcloud;

import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;

/**
 * @author CC11001100
 */
public class ChinaTelecomCloudOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {
        // TODO 根据文档对接API  https://eop.ctyun.cn/ebp/ctapiSDKCenter/search?sid=9
        return null;
    }

}
