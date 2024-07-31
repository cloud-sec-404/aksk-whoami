package com.github.cloudsec.akskwhoami.service.impl.ucloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.job.OfflineTestJob;

/**
 *
 * UCloud（）
 *
 * @author CC11001100
 */
public class UCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "UCloud";
    }

    @Override
    public String getProductUrl() {
        return "https://www.ucloud.cn/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new UCloudOfflineTestJob();
    }

}
