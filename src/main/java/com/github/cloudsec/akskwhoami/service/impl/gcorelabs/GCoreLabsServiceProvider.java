package com.github.cloudsec.akskwhoami.service.impl.gcorelabs;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.job.OfflineTestJob;

/**
 *
 * G-Core Labs
 *
 * @author CC11001100
 */
public class GCoreLabsServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "G-Core Labs";
    }

    @Override
    public String getProductUrl() {
        return "https://gcore.com/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new GCoreLabsOfflineTestJob();
    }

}
