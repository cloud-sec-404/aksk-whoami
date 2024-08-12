package com.github.cloudsec.akskwhoami.service.impl.alicloud.jdcloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OfflineTestJob;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;

/**
 * @author CC11001100
 */
public class JdCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "京东云";
    }

    @Override
    public String getProductUrl() {
        return "https://console.jdcloud.com/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new JdCloudOfflineTestJob();
    }

    @Override
    public OnlineTestJob getOnlineTestJob() {
        return new JdCloudOnlineTestJob();
    }

}
