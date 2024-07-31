package com.github.cloudsec.akskwhoami.service.impl.kingsoftcloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.job.OfflineTestJob;

/**
 * @author CC11001100
 */
public class KingSoftCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "金山云";
    }

    @Override
    public String getProductUrl() {
        return "https://www.ksyun.com/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new KingSoftCloudOfflineTestJob();
    }

}
