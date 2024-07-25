package com.github.cloudsec.akskwhoami.service.base;

import com.github.cloudsec.akskwhoami.service.domain.TestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 * 用于表示一个服务提供商，服务提供商提供aksk识别测试的能力
 *
 * @author CC11001100
 */
public interface ServiceProvider {

    /**
     * sp当前实现版本
     *
     * @return
     */
    long getVersion();

    /**
     * 用于执行aksk测试任务
     *
     * @param task
     * @return
     * @throws ServiceProviderTestException
     */
    TestResult test(TestTask task) throws ServiceProviderTestException;

    /**
     * 此服务提供商的名称
     *
     * @return
     */
    String getName();

    /**
     * 此服务商的产品URL
     *
     * @return
     */
    String getProductUrl();

    /**
     * @return
     */
    String getAccessKeyAliasName();

    /**
     * @return
     */
    String getSecureKeyAliasName();

    // TODO 2024-07-25 21:18:24 当有检测结果的时候，跟着推荐一些对应的后续的利用工具

}
