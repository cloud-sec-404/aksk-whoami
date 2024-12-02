package com.github.cloudsec.akskwhoami.service.impl.baiducloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OfflineTestJob;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;

/**
 * @author CC11001100
 */
public class BaiduCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "百度云";
    }

    @Override
    public String getProductUrl() {
        return "https://cloud.baidu.com/";
    }

    @Override
    public OnlineTestJob getOnlineTestJob() {
        return new BaiduCloudOnlineTestJob();
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new BaiduCloudOfflineTestJob();
    }

}
