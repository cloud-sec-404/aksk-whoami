package com.github.cloudsec.akskwhoami.service.impl.gcp;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.job.OfflineTestJob;

/**
 * @author CC11001100
 */
public class GoogleCloudPlatformServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "GCP";
    }

    @Override
    public String getProductUrl() {
        return "https://cloud.google.com/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new GoogleCloudPlatformOfflineTestJob();
    }

}
