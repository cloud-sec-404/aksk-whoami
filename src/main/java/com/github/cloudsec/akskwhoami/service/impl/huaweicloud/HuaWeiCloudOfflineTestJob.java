package com.github.cloudsec.akskwhoami.service.impl.huaweicloud;

import com.github.cloudsec.akskwhoami.service.base.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class HuaWeiCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#%E5%8D%8E%E4%B8%BA%E4%BA%91
        // 华为云 (Huawei Cloud) 的 Access Key 是20个随机大写字母和数字组成，较难用正则表达式匹配。
        return null;
    }

}
