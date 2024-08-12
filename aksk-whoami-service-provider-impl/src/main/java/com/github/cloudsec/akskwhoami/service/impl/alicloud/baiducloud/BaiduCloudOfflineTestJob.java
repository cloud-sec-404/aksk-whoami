package com.github.cloudsec.akskwhoami.service.impl.alicloud.baiducloud;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class BaiduCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#%E7%99%BE%E5%BA%A6%E4%BA%91
        // 百度云 (Baidu Cloud) 的 Access Key 开头标识一般是 "AK"。
        return "^AK[A-Za-z0-9]{10,40}$";
    }

}
