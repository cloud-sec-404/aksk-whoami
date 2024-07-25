package com.github.cloudsec.akskwhoami.utils;

/**
 *
 * 此工具中所有的异常都要继承此异常
 *
 * @author CC11001100
 */
public class AkskWhoamiException extends Exception {

    public AkskWhoamiException() {
    }

    public AkskWhoamiException(String message) {
        super(message);
    }

    public AkskWhoamiException(String message, Throwable cause) {
        super(message, cause);
    }

    public AkskWhoamiException(Throwable cause) {
        super(cause);
    }

    public AkskWhoamiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
