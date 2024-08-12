package com.github.cloudsec.akskwhoami.service.job;

import com.github.cloudsec.akskwhoami.service.constants.AuthType;
import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.result.OfflineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import org.apache.commons.lang3.StringUtils;

/**
 * 通过正则来测试来做离线匹配
 *
 * @author CC11001100
 */
public abstract class RegexpOfflineTestJob implements OfflineTestJob {

    @Override
    public OfflineTestResult execute(TestTask task) throws ServiceProviderTestException {

        if (StringUtils.isNotBlank(task.getAccessKey())) {
            String pattern = getAccessKeyPattern();
            if (pattern != null && task.getAccessKey().matches(pattern)) {
                return OfflineTestResult.builder().authType(AuthType.AKSK).confidence(1).description("Access key pattern match").build();
            }
        }

        if (StringUtils.isNotBlank(task.getSecretKey())) {
            String pattern = getSecretKeyPattern();
            if (pattern != null && task.getSecretKey().matches(pattern)) {
                return OfflineTestResult.builder().authType(AuthType.AKSK).confidence(1).description("Secret key pattern match").build();
            }
        }

        return OfflineTestResult.failed().setAuthType(AuthType.AKSK).setDescription("The input access key or secret key does not match the pattern");
    }

    /**
     *
     * 要与ak匹配的正则模式，一般不同平台的ak会带有特征，主要是通过这个特征来识别
     *
     * @return
     */
    public String getAccessKeyPattern() {
        return null;
    }

    /**
     *
     * 要与sk匹配的正则模式
     *
     * @return
     */
    public String getSecretKeyPattern() {
        return null;
    }

}
