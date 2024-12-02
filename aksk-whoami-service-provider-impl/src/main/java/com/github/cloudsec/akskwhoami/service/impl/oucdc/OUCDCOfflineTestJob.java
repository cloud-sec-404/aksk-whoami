package com.github.cloudsec.akskwhoami.service.impl.oucdc;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class OUCDCOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#%E5%8D%97%E5%A4%A7%E9%80%9A%E7%94%A8%E4%BA%91
        // 南大通用云 (OUCDC) 的 Access Key 开头标识一般是 "CI"。
        return "^CI[A-Za-z0-9]{10,40}$";
    }

}
