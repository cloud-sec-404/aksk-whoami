package com.github.cloudsec.akskwhoami.executor.base;

import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 *
 * 执行测试任务的执行器
 *
 * @author CC11001100
 */
public interface TestTaskExecutor {

    /**
     *
     * 执行测试任务，注意此方法是阻塞式的，直到任务执行完毕（成功或失败）此方法才会结束
     *
     * @param task
     * @throws TestTaskExecuteException
     */
    void execute(TestTask task) throws TestTaskExecuteException;

}
