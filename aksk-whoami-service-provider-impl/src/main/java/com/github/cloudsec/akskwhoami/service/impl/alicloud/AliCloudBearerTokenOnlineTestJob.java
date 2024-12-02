package com.github.cloudsec.akskwhoami.service.impl.alicloud;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.auth.BearerTokenCredentials;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.github.cloudsec.akskwhoami.service.constants.AuthType;
import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.validator.TestTaskAkSkValidator;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * TODO 未测试
 *
 * @author CC11001100
 */
@Slf4j
public class AliCloudBearerTokenOnlineTestJob implements OnlineTestJob {

    @TestTaskAkSkValidator(requireAccessKey = false)
    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {
        DefaultProfile profile = DefaultProfile.getProfile(AliCloudConstant.REGION);
        BearerTokenCredentials bearerTokenCredential = new BearerTokenCredentials(task.getSecretKey());
        DefaultAcsClient client = new DefaultAcsClient(profile, bearerTokenCredential);

        DescribeInstancesRequest request = new DescribeInstancesRequest();
        try {
            DescribeInstancesResponse response = client.getAcsResponse(request);
            List<DescribeInstancesResponse.Instance> instances = response.getInstances();
            return OnlineTestResult.builder().authType(AuthType.BEARER).isAuthSuccess(true).extra(instances).build();
        } catch (ClientException e) {
            return OnlineTestResult.failed(AuthType.BEARER).setDescription(e.getMessage());
        }
    }

}
