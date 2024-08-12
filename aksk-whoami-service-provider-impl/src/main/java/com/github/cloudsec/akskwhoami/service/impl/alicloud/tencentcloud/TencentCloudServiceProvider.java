package com.github.cloudsec.akskwhoami.service.impl.alicloud.tencentcloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OfflineTestJob;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;

/**
 * @author CC11001100
 */
public class TencentCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "腾讯云";
    }

    @Override
    public String getProductUrl() {
        return "https://cloud.tencent.com/";
    }

    @Override
    public OnlineTestJob getOnlineTestJob() {
        return new TencentCloudOnlineTestJob();
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new TencentCloudOfflineTestJob();
    }

}
