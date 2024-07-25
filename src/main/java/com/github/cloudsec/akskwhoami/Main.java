package com.github.cloudsec.akskwhoami;

import com.github.cloudsec.akskwhoami.cli.domain.TestTaskExecutorConfig;
import com.github.cloudsec.akskwhoami.cli.parser.CommandParamParser;
import com.github.cloudsec.akskwhoami.cli.parser.CommandParamParserException;
import com.github.cloudsec.akskwhoami.cli.validator.TestTaskExecutorConfigValidator;
import com.github.cloudsec.akskwhoami.cli.validator.ValidatorException;
import com.github.cloudsec.akskwhoami.executor.base.TestTaskExecuteException;
import com.github.cloudsec.akskwhoami.executor.concurrency.ConcurrencyTestTaskExecutor;

/**
 *
 * 程序主入口
 *
 * @author CC11001100
 */
public class Main {

    public static void main(String[] args) throws TestTaskExecuteException, CommandParamParserException, ValidatorException {

        TestTaskExecutorConfig config = new CommandParamParser().parse(args);
        if (config == null) {
            return;
        }
        new TestTaskExecutorConfigValidator().validate(config);

        ConcurrencyTestTaskExecutor executor = new ConcurrencyTestTaskExecutor();
        executor.execute(config);

    }

}
