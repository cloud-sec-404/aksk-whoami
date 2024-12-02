package com.github.cloudsec.akskwhoami.service.impl.chinaunicomcloud;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class ChinaUniComOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#%E8%81%94%E9%80%9A%E4%BA%91
        // 联通云 (China Unicom Cloud) 的 Access Key 开头标识一般是 "LTC"。
        return "^LTC[A-Za-z0-9]{10,60}$";
    }

}
