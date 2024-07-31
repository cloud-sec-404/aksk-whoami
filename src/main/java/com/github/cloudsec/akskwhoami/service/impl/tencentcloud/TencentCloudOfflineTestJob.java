package com.github.cloudsec.akskwhoami.service.impl.tencentcloud;

import com.github.cloudsec.akskwhoami.service.base.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class TencentCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#%E8%85%BE%E8%AE%AF%E4%BA%91
        // 腾讯云 (Tencent Cloud) 的 Access Key 开头标识一般是 "AKID"。
        // SecretId长度为17个字符，由字母和数字组成。
        // SecretKey长度为40个字符，由字母和数字组成。
        return "^AKID[A-Za-z0-9]{13,20}$";
    }

}
