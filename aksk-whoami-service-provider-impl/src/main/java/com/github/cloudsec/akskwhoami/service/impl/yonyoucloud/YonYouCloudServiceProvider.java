package com.github.cloudsec.akskwhoami.service.impl.yonyoucloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OfflineTestJob;

/**
 * 用友云 (YonYou Cloud)
 *
 * @author CC11001100
 */
public class YonYouCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "用友云";
    }

    @Override
    public String getProductUrl() {
        return "https://market.yonyoucloud.com/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new YonYouCloudOfflineTestJob();
    }

}
