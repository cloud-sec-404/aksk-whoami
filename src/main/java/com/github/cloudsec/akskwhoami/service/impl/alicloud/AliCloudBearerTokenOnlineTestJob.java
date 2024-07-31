package com.github.cloudsec.akskwhoami.service.impl.alicloud;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.auth.BearerTokenCredentials;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.github.cloudsec.akskwhoami.service.base.AuthType;
import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

/**
 *
 * TODO 未测试
 *
 * @author CC11001100
 */
@Slf4j
public class AliCloudBearerTokenOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

        DefaultProfile profile = DefaultProfile.getProfile(AliCloudConstant.REGION);
        BearerTokenCredentials bearerTokenCredential = new BearerTokenCredentials(task.getSecretKey());
        DefaultAcsClient client = new DefaultAcsClient(profile, bearerTokenCredential);

        DescribeInstancesRequest request = new DescribeInstancesRequest();
        try {
            DescribeInstancesResponse response = client.getAcsResponse(request);
            List<DescribeInstancesResponse.Instance> instances = response.getInstances();
            if (CollectionUtils.isEmpty(instances)) {
                return OnlineTestResult.failed(AuthType.BEARER);
            }
            OnlineTestResult.builder().isAuthSuccess(true).authType(AuthType.BEARER).extra(instances).build();
        } catch (ClientException e) {
            log.error("Testing the validity of the Alibaba Cloud beare credentials results in an exception: {}", e.getMessage());
        }
        return OnlineTestResult.failed(AuthType.BEARER);
    }
}
