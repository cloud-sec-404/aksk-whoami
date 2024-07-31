package com.github.cloudsec.akskwhoami.service.impl.azure;

import com.github.cloudsec.akskwhoami.service.base.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class AzureOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#microsoft-azure
        // Microsoft Azure 的 Access Key 开头标识一般是 "AZ"。
        // Azure AD Application的Client ID通常用作Access Key，长度为36个字符，由字母和数字组成。
        // 对于Azure AD Application的密钥（Secret），长度为44个字符，由字母、数字和特殊字符组成。
        return "^AZ[A-Za-z0-9]{34,40}$";
    }

}
