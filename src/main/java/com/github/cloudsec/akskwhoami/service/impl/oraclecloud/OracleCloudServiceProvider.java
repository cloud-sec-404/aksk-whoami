package com.github.cloudsec.akskwhoami.service.impl.oraclecloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.job.OfflineTestJob;

/**
 * @author CC11001100
 */
public class OracleCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "Oracle Cloud";
    }

    @Override
    public String getProductUrl() {
        return "https://www.oracle.com/cloud/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new OracleCloudOfflineTestJob();
    }

}
