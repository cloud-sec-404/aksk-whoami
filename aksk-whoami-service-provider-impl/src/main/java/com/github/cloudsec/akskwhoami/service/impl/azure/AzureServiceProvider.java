package com.github.cloudsec.akskwhoami.service.impl.azure;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OfflineTestJob;

/**
 * @author CC11001100
 */
public class AzureServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "Azure";
    }

    @Override
    public String getProductUrl() {
        return "https://azure.microsoft.com/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new AzureOfflineTestJob();
    }

}
