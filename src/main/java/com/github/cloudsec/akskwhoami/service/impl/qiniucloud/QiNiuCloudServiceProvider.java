package com.github.cloudsec.akskwhoami.service.impl.qiniucloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;

/**
 * @author CC11001100
 */
public class QiNiuCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "七牛云";
    }

    @Override
    public String getProductUrl() {
        return "https://www.qiniu.com/";
    }

    @Override
    public OnlineTestJob getOnlineTestJob() {
        return new QiNiuOnlineTestJob();
    }

}
