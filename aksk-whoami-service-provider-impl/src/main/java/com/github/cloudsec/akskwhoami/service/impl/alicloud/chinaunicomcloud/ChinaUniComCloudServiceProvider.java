package com.github.cloudsec.akskwhoami.service.impl.alicloud.chinaunicomcloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OfflineTestJob;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;

/**
 * 联通云 (China Unicom Cloud)
 *
 * @author CC11001100
 */
public class ChinaUniComCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "联通云";
    }

    @Override
    public String getProductUrl() {
        return "https://www.cucloud.cn/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new ChinaUniComOfflineTestJob();
    }

    @Override
    public OnlineTestJob getOnlineTestJob() {
        return new ChinaUniComOnlineTestJob();
    }

}
