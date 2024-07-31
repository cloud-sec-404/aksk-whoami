package com.github.cloudsec.akskwhoami.cli.validator;

import com.github.cloudsec.akskwhoami.cli.domain.TestTaskExecutorConfig;
import org.apache.commons.lang3.StringUtils;

/**
 * 校验识别启动任务时的参数是否正确
 *
 * @author CC11001100
 */
public class TestTaskExecutorConfigValidator {

    /**
     * @param config
     * @throws ValidatorException
     */
    public void validate(TestTaskExecutorConfig config) throws ValidatorException {

        // ak、sk不能同时为空
        if (StringUtils.isBlank(config.getAccessKey()) && StringUtils.isBlank(config.getSecretKey())) {
            throw new ValidatorException("AK and SK cannot be empty at the same time, please specify at least one.");
        }

        // 至少应该有一个用来测试的网络模式
        if (config.getAllowNetworkModes() == null || config.getAllowNetworkModes().isEmpty()) {
            throw new ValidatorException("Network mode cannot be empty.");
        }

    }


}
