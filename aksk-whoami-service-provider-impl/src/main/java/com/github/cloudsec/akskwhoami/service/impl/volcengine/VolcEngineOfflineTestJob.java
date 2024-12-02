package com.github.cloudsec.akskwhoami.service.impl.volcengine;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class VolcEngineOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://www.volcengine.com/docs/6291/65568
        // https://wiki.teamssix.com/CloudService/more/#%E5%AD%97%E8%8A%82%E8%B7%B3%E5%8A%A8%E7%81%AB%E5%B1%B1%E5%BC%95%E6%93%8E
        // 字节跳动火山引擎 (Volcengine) 的 Access Key 开头标识一般是 "AKLT"，长度小于256位。
        return "^AKLT[a-zA-Z0-9-_]{0,252}";
    }

}
