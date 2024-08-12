package com.github.cloudsec.akskwhoami.executor.event;

import com.alibaba.fastjson2.JSON;
import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.result.OfflineTestResult;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.result.TestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;

/**
 * 把结果输出到控制台上
 * <p>
 * TODO 2024-08-01 01:08:11 把结果输出做得更容易看懂理解
 *
 * @author CC11001100
 */
public class TerminalShowTaskTestEventListener extends AbstractTaskTestEventListener {

    @Override
    public void processSingleExecuteSuccess(TestTask task, ServiceProvider serviceProvider, TestResult result) {

        if (result.getOnlineTestResultList() != null && !result.getOnlineTestResultList().isEmpty()) {
            for (OnlineTestResult r : result.getOnlineTestResultList()) {
                if (r.isAuthSuccess()) {
                    System.out.printf("Service provider: %s, auth type = %s, online test success!!! description = %s, extra = %s \n",
                            serviceProvider.getName(), r.getAuthType(), r.getDescription(), JSON.toJSONString(r.getExtra()));
                } else {
                    System.out.printf("Service provider: %s, auth type = %s, online test failed, description = %s, extra = %s \n",
                            serviceProvider.getName(), r.getAuthType(), r.getDescription(), JSON.toJSONString(r.getExtra()));
                }
            }
        }

        if (result.getOfflineTestResultList() != null && !result.getOfflineTestResultList().isEmpty()) {
            for (OfflineTestResult r : result.getOfflineTestResultList()) {
                if (r.getConfidence() > 0.8) {
                    System.out.printf("Service provider: %s, auth type = %s, offline test success!!! description = %s, extra = %s \n",
                            serviceProvider.getName(), r.getAuthType(), r.getDescription(), JSON.toJSONString(r.getExtra()));
                } else {
                    System.out.printf("Service provider: %s, auth type = %s, offline test failed, description = %s, extra = %s \n",
                            serviceProvider.getName(), r.getAuthType(), r.getDescription(), JSON.toJSONString(r.getExtra()));
                }
            }
        }

    }

    @Override
    public void processSingleExecuteException(TestTask task, ServiceProvider serviceProvider, Exception e) {
        System.err.printf("Service provider: %s, test exception: %s \n", serviceProvider.getName(), e.getMessage());
    }

}
