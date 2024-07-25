package com.github.cloudsec.akskwhoami.service.base;

import com.github.cloudsec.akskwhoami.utils.AkskWhoamiException;

/**
 * @author CC11001100
 */
public class ServiceProviderTestException extends AkskWhoamiException {

    public ServiceProviderTestException() {
    }

    public ServiceProviderTestException(String message) {
        super(message);
    }

    public ServiceProviderTestException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceProviderTestException(Throwable cause) {
        super(cause);
    }

    public ServiceProviderTestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
