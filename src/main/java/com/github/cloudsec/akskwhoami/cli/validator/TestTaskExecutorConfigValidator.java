package com.github.cloudsec.akskwhoami.cli.validator;

import com.github.cloudsec.akskwhoami.cli.domain.TestTaskExecutorConfig;
import org.apache.commons.lang3.StringUtils;

/**
 * @author CC11001100
 */
public class TestTaskExecutorConfigValidator {

    public void validate(TestTaskExecutorConfig config) throws ValidatorException {

        // ak、sk不能同时为空
        if (StringUtils.isBlank(config.getAccessKey()) && StringUtils.isBlank(config.getSecretKey())) {
            throw new ValidatorException("AK and SK cannot be empty at the same time, please specify at least one.");
        }

        if (config.getAllowNetworkModes() == null || config.getAllowNetworkModes().isEmpty()) {
            throw new ValidatorException("Network mode cannot be empty.");
        }

    }


}
