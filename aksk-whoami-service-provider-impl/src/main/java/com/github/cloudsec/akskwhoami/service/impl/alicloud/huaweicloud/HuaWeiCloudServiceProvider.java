package com.github.cloudsec.akskwhoami.service.impl.alicloud.huaweicloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;

/**
 * 探测华为云
 *
 *
 * @author CC11001100
 */
public class HuaWeiCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "华为云";
    }

    @Override
    public String getProductUrl() {
        return "https://activity.huaweicloud.com/";
    }

    @Override
    public OnlineTestJob getOnlineTestJob() {
        return new HuaWeiCloudOnlineTestJob();
    }

}
