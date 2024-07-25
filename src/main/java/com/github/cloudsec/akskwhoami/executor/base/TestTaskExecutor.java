package com.github.cloudsec.akskwhoami.executor.base;

import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 * @author CC11001100
 */
public interface TestTaskExecutor {

    /**
     *
     * @param task
     * @throws TestTaskExecuteException
     */
    void execute(TestTask task) throws TestTaskExecuteException;

}
