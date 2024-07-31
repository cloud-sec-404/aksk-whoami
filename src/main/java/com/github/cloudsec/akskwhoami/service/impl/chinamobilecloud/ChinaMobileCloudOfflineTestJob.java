package com.github.cloudsec.akskwhoami.service.impl.chinamobilecloud;

import com.github.cloudsec.akskwhoami.service.base.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class ChinaMobileCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#%E7%A7%BB%E5%8A%A8%E4%BA%91
        // 移动云 (China Mobile Cloud) 的 Access Key 开头标识一般是 "YD"。
        return "^YD[A-Za-z0-9]{10,60}$";
    }

}
