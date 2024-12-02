package com.github.cloudsec.akskwhoami.service.impl.oraclecloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OfflineTestJob;

/**
 *
 * 是公钥私钥认证方式
 *
 * https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkgettingstarted.htm
 *
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
