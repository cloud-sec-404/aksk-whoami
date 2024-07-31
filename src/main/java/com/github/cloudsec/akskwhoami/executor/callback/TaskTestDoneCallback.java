package com.github.cloudsec.akskwhoami.executor.callback;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.domain.TestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 * 任务每次测试完一个服务商之后都会触发一次此回调，把服务商的测试结果传进来让处理，这是一个函数式方法
 *
 * @author CC11001100
 */
@FunctionalInterface
public interface TaskTestDoneCallback {

    /**
     * 每次的回调方法
     *
     * @param task 被测试的任务
     * @param serviceProvider 刚刚测试完成的是哪个服务商
     * @param result 测试的结果，当测试时抛出异常的话这个参数为null
     * @param e 测试时如果发生了异常的话，这个是抛出的异常，如果测试时没有抛出异常，则此参数为null
     */
    void apply(TestTask task, ServiceProvider serviceProvider, TestResult result, Exception e);

}
