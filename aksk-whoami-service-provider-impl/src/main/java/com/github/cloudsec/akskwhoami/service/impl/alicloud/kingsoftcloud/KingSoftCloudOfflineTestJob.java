package com.github.cloudsec.akskwhoami.service.impl.alicloud.kingsoftcloud;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class KingSoftCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#%E9%87%91%E5%B1%B1%E4%BA%91
        // 金山云 (Kingsoft Cloud) 的 Access Key 开头标识一般是 "AKLT"。
        return "^AKLT[a-zA-Z0-9-_]{16,28}";
    }

}
