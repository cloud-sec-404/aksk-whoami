package com.github.cloudsec.akskwhoami.service.impl.chinamobilecloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.job.OfflineTestJob;

/**
 *
 * 移动云 (China Mobile Cloud)
 *
 * @author CC11001100
 */
public class ChinaMobileCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "移动云";
    }

    @Override
    public String getProductUrl() {
        return "https://ecloud.10086.cn/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new ChinaMobileCloudOfflineTestJob();
    }

}
