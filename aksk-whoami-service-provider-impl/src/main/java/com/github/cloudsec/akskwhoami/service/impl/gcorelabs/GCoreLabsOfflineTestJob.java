package com.github.cloudsec.akskwhoami.service.impl.gcorelabs;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class GCoreLabsOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#g-core-labs
        // G-Core Labs 的 Access Key 开头标识一般是 "gcore"
        return "^gcore[A-Za-z0-9]{10,30}$";
    }

}
