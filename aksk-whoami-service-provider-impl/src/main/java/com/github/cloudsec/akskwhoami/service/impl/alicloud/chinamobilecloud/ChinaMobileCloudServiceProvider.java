package com.github.cloudsec.akskwhoami.service.impl.alicloud.chinamobilecloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OfflineTestJob;

/**
 * 移动云 (China Mobile Cloud)
 * <p>
 * TODO 对接java-sdk，联网测试aksk是否OK
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
