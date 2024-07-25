package com.github.cloudsec.akskwhoami.executor.base;

import com.github.cloudsec.akskwhoami.utils.AkskWhoamiException;

/**
 * @author CC11001100
 */
public class TestTaskExecuteException extends AkskWhoamiException {

    public TestTaskExecuteException() {
    }

    public TestTaskExecuteException(String message) {
        super(message);
    }

    public TestTaskExecuteException(String message, Throwable cause) {
        super(message, cause);
    }

    public TestTaskExecuteException(Throwable cause) {
        super(cause);
    }

    public TestTaskExecuteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
