package com.github.cloudsec.akskwhoami.service.impl.alicloud.alicloud;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class AliCloudOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // 阿里云 (Alibaba Cloud) 的 Access Key 开头标识一般是 "LTAI"。
        // Access Key ID长度为16-24个字符，由大写字母和数字组成。
        // Access Key Secret长度为30个字符，由大写字母、小写字母和数字组成。
        return "^LTAI[A-Za-z0-9]{12,20}$";
    }

}
