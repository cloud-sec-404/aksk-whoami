package com.github.cloudsec.akskwhoami.service.impl.aws;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OfflineTestJob;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;

/**
 * AWS
 *
 * @author CC11001100
 */
public class AwsServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "AWS";
    }

    @Override
    public String getProductUrl() {
        return "https://aws.amazon.com/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new AwsOfflineTestJob();
    }

    @Override
    public OnlineTestJob getOnlineTestJob() {
        return new AwsOnlineTestJob();
    }

}

