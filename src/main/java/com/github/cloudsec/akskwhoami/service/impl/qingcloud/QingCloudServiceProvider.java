package com.github.cloudsec.akskwhoami.service.impl.qingcloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.job.OfflineTestJob;

/**
 *
 * 青云（https://www.qingcloud.com/）
 *
 * @author CC11001100
 */
public class QingCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "青云";
    }

    @Override
    public String getProductUrl() {
        return "https://www.qingcloud.com/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new QingCloudOfflineTestJob();
    }

}
