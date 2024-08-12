package com.github.cloudsec.akskwhoami.service.base;

import com.github.cloudsec.akskwhoami.service.constants.NetworkMode;
import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.result.TestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;

import java.util.List;

/**
 * 用于表示一个服务提供商，服务提供商提供ak/sk识别测试的能力
 *
 * @author CC11001100
 */
public interface ServiceProvider {

    /**
     * sp当前实现版本，可维护性考虑，逻辑变动时可自增此版本号数字
     *
     * @return
     */
    long getVersion();

    /**
     * 用于执行ak/sk测试任务，任务被执行时会返回执行结果，或者抛出异常
     *
     * @param task
     * @return
     * @throws ServiceProviderTestException
     */
    TestResult test(TestTask task) throws ServiceProviderTestException;

    /**
     * 此服务提供商的名称，用于展示标识
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
     * 获取支持的网络模式都有哪些
     *
     * @return
     */
    List<NetworkMode> getSupportNetworkModeList();

    /**
     * 获取默认的认证类型
     *
     * @return
     */
    String getDefaultAuthType();

    /**
     * 如果在这个服务商，对于ak有别的叫法，可以在这里定制，比如有些是公私钥机制
     *
     * @return
     */
    String getAccessKeyAliasName();

    /**
     * 如果在这个服务商，对于sl有别的叫法，可以在这里定制，比如有些是公私钥机制
     *
     * @return
     */
    String getSecureKeyAliasName();

    // TODO 2024-07-25 21:18:24 当有检测结果的时候，跟着推荐一些对应的后续的利用工具

}
