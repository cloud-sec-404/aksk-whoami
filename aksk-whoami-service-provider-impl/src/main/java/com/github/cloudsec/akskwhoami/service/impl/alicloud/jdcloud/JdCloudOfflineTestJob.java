package com.github.cloudsec.akskwhoami.service.impl.alicloud.jdcloud;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class JdCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#%E4%BA%AC%E4%B8%9C%E4%BA%91
        // 京东云 (JD Cloud) 的 Access Key 开头标识一般是 "JDC_"。
        return "^JDC_[A-Z0-9]{28,32}";
    }

}
