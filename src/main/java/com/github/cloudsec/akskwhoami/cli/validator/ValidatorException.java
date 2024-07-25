package com.github.cloudsec.akskwhoami.cli.validator;

import com.github.cloudsec.akskwhoami.utils.AkskWhoamiException;

/**
 * @author CC11001100
 */
public class ValidatorException extends AkskWhoamiException {

    public ValidatorException() {
    }

    public ValidatorException(String message) {
        super(message);
    }

    public ValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidatorException(Throwable cause) {
        super(cause);
    }

    public ValidatorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
