package com.github.cloudsec.akskwhoami.cli;

import com.github.cloudsec.akskwhoami.cli.domain.TestTaskExecutorConfig;
import com.github.cloudsec.akskwhoami.cli.parser.CommandParamParser;
import com.github.cloudsec.akskwhoami.cli.parser.CommandParamParserException;
import com.github.cloudsec.akskwhoami.cli.validator.TestTaskExecutorConfigValidator;
import com.github.cloudsec.akskwhoami.cli.validator.ValidatorException;
import com.github.cloudsec.akskwhoami.executor.base.TestTaskExecuteException;
import com.github.cloudsec.akskwhoami.executor.concurrency.ConcurrencyTestTaskExecutor;
import com.github.cloudsec.akskwhoami.executor.event.TaskTestEventListener;
import com.github.cloudsec.akskwhoami.executor.event.TerminalShowProgressBarEventListener;
import com.github.cloudsec.akskwhoami.executor.event.TerminalShowTaskTestEventListener;
import com.github.cloudsec.akskwhoami.executor.selector.AllServiceProviderSelector;

import java.util.Arrays;
import java.util.List;

/**
 * 程序主入口
 *
 * @author CC11001100
 */
public class CliMain {

    public static void main(String[] args) throws TestTaskExecuteException, CommandParamParserException, ValidatorException {

        TestTaskExecutorConfig config = new CommandParamParser().parse(args);
        if (config == null) {
            return;
        }
        new TestTaskExecutorConfigValidator().validate(config);

        ConcurrencyTestTaskExecutor executor = new ConcurrencyTestTaskExecutor();
        List<TaskTestEventListener> listeners = Arrays.asList(new TerminalShowProgressBarEventListener(), new TerminalShowTaskTestEventListener());
        executor.setListeners(listeners);
        executor.setSelector(new AllServiceProviderSelector());
        executor.execute(config);

    }

}
