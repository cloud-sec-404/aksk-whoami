package com.github.cloudsec.akskwhoami.service.impl.alicloud.gcp;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class GoogleCloudPlatformOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#google-cloud-platform
        // Google Cloud Platform (GCP) 的 Access Key 开头标识一般是 "GOOG"。
        // 服务账号的JSON文件中包含了Access Key和密钥的信息，其中Access Key为client_email，其长度不固定，由字母、数字和特殊字符组成。
        // 密钥（Key）的长度为256个字符，由字母、数字和特殊字符组成。
        return "^GOOG[\\w\\W]{10,30}$";
    }

}
