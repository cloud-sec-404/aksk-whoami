package com.github.cloudsec.akskwhoami.service.impl.jdcloud;

import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.validator.TestTaskAkSkValidator;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import com.jdcloud.sdk.service.vm.client.VmClient;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceResponse;

/**
 *
 * TODO 2024-08-02 01:19:56 测试京东云的aksk
 *
 * https://github.com/jdcloud-api/jdcloud-sdk-java
 *
 * @author CC11001100
 */
public class JdCloudOnlineTestJob implements OnlineTestJob {

    @TestTaskAkSkValidator
    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {
        CredentialsProvider credentialsProvider = new StaticCredentialsProvider(task.getAccessKey(), task.getSecretKey());
        VmClient vmClient = VmClient.builder()
                .credentialsProvider(credentialsProvider)
                .httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTPS).build())
                .build();
        DescribeInstanceRequest request = new DescribeInstanceRequest();
        request.regionId("cn-north-1");
        request.instanceId("i-c0se9uju");
        DescribeInstanceResponse response = vmClient.describeInstance(request);
        // 能执行成功就认为是aksk有权限
        return OnlineTestResult.successWithExtra(response);
    }

}
