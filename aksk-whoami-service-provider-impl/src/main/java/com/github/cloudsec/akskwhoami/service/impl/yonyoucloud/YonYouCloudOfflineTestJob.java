package com.github.cloudsec.akskwhoami.service.impl.yonyoucloud;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class YonYouCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#%E7%94%A8%E5%8F%8B%E4%BA%91
        // 用友云 (YonYou Cloud) 的 Access Key 开头标识一般是 "YY"。
        return "^YY[A-Za-z0-9]{10,40}$";
    }

}
