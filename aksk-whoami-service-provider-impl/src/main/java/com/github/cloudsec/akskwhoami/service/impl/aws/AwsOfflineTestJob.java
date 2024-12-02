package com.github.cloudsec.akskwhoami.service.impl.aws;

import com.github.cloudsec.akskwhoami.service.job.RegexpOfflineTestJob;

/**
 * @author CC11001100
 */
public class AwsOfflineTestJob extends RegexpOfflineTestJob {

    @Override
    public String getAccessKeyPattern() {
        // https://wiki.teamssix.com/CloudService/more/#amazon-web-services
        // 亚马逊云计算服务 (Amazon Web Services, AWS) 的 Access Key 开头标识一般是 "AKIA"。
        // Access Key ID: 20个随机的大写字母和数字组成的字符，例如 AKHDNAPO86BSHKDIRYTE
        // Secret Access Key ID: 40个随机的大小写字母组成的字符，例如 S836fh/J73yHSb64Ag3Rkdi/jaD6sPl6/antFtU（无法找回丢失的 Secret Access Key ID）。
        return "^AZ[A-Za-z0-9]{34,40}$";
    }

}
