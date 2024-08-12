package com.github.cloudsec.akskwhoami.service.impl.alicloud.chinatelecomcloud;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class ChinaTelecomCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#%E7%94%B5%E4%BF%A1%E4%BA%91
        // 中国电信云 (China Telecom Cloud) 的 Access Key 开头标识一般是 "CTC"。
        return "^CTC[A-Za-z0-9]{10,60}$";
    }

}
