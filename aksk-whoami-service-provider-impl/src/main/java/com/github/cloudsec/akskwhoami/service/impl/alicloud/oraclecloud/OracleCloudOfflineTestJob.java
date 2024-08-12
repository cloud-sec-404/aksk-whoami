package com.github.cloudsec.akskwhoami.service.impl.alicloud.oraclecloud;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class OracleCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#oracle-cloud
        // Oracle云 (Oracle Cloud) 的 Access Key 开头标识一般是 "OCID"。
        return "^OCID[A-Za-z0-9]{10,40}$";
    }

}
