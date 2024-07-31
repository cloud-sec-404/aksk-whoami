package com.github.cloudsec.akskwhoami.service.impl.yiyuntong;

import com.github.cloudsec.akskwhoami.service.base.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class YiYunTongOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/cloudservice/more/#%E4%B8%80%E4%BA%91%E9%80%9A
        // 一云通 (YiYunTong) 的 Access Key 开头标识一般是 "YYT"。
        return "^YYT[A-Za-z0-9]{10,60}$";
    }

}
