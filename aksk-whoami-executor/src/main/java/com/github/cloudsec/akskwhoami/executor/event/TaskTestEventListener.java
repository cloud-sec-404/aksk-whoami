package com.github.cloudsec.akskwhoami.executor.event;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.result.TestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;

import java.util.List;

/**
 * 可以给任务执行器设置任务事件回调，则在执行过程中特定时间节点触发事件回调
 *
 * @author CC11001100
 */
public interface TaskTestEventListener {

    /**
     * 有新任务提交的时候触发此事件
     *
     * @param task
     */
    void onSubmit(TestTask task);

    /**
     *
     * 在为任务准备sp的时候触发此事件
     *
     * @param task 要测试的任务
     * @param serviceProviderList 要为此任务执行哪些sp测试
     */
    void onTestTaskSelector(TestTask task, List<ServiceProvider> serviceProviderList);

    /**
     * 单个service provider测试完毕之后回调的方法
     *
     * @param task            被测试的任务
     * @param serviceProvider 刚刚测试完成的是哪个服务商
     * @param result          测试的结果，当测试时抛出异常的话这个参数为null
     * @param e               测试时如果发生了异常的话，这个是抛出的异常，如果测试时没有抛出异常，则此参数为null
     */
    void onSingleServiceProviderDone(TestTask task, ServiceProvider serviceProvider, TestResult result, Exception e);

    // 2024-08-12 22:49:07 因为是拆解为若干个子任务并发执行，所以此事件无法再提供
//    /**
//     * 所有的service provider都测试完毕之后回调的方法，但是这个方法并不会持有着测试过的结果，如果回调器需要的话可以自己收集持有结果并在这一步使用
//     *
//     * @param task
//     */
//    void onAllServiceProviderDone(TestTask task);

}
