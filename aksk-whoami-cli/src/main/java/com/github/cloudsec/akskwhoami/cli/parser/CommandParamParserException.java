package com.github.cloudsec.akskwhoami.cli.parser;

import com.github.cloudsec.akskwhoami.utils.AkskWhoamiException;

/**
 *
 * 命令行参数解析异常
 *
 * @author CC11001100
 */
public class CommandParamParserException extends AkskWhoamiException {

    public CommandParamParserException() {
    }

    public CommandParamParserException(String message) {
        super(message);
    }

    public CommandParamParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommandParamParserException(Throwable cause) {
        super(cause);
    }

    public CommandParamParserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
