package com.github.cloudsec.akskwhoami.service.impl.qingcloud;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class QingCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#%E9%9D%92%E4%BA%91
        // 青云 (QingCloud) 的 Access Key 开头标识一般是 "QY"。
        return "^QY[A-Za-z0-9]{10,40}$";
    }

}
