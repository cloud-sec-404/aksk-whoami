package com.github.cloudsec.akskwhoami.service.impl.ucloud;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class UCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#ucloud
        // UCloud (UCloud) 的 Access Key 开头标识一般是 "UC"
        return "^UC[A-Za-z0-9]{10,40}$";
    }

}
