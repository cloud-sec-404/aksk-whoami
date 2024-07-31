package com.github.cloudsec.akskwhoami.service.base.job;

import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.domain.OfflineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;
import org.apache.commons.lang3.StringUtils;

/**
 * 通过正则来测试
 *
 * @author CC11001100
 */
public abstract class RegexpOfflineTestJob implements OfflineTestJob {

    @Override
    public OfflineTestResult execute(TestTask task) throws ServiceProviderTestException {

        if (StringUtils.isNotBlank(task.getAccessKey())) {
            String pattern = getAccessKeyPattern();
            if (pattern != null && task.getAccessKey().matches(pattern)) {
                return OfflineTestResult.builder().confidence(1).description("Access key pattern match").build();
            }
        }

        if (StringUtils.isNotBlank(task.getSecretKey())) {
            String pattern = getSecurityKeyPattern();
            if (pattern != null && task.getSecretKey().matches(pattern)) {
                return OfflineTestResult.builder().confidence(1).description("Security key pattern match").build();
            }
        }

        return OfflineTestResult.failed();
    }

    /**
     * @return
     */
    public String getAccessKeyPattern() {
        return null;
    }

    /**
     * @return
     */
    public String getSecurityKeyPattern() {
        return null;
    }

}
