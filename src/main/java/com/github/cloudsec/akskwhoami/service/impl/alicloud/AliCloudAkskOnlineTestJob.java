package com.github.cloudsec.akskwhoami.service.impl.alicloud;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.auth.BasicCredentials;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.github.cloudsec.akskwhoami.service.base.AuthType;
import com.github.cloudsec.akskwhoami.service.base.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;
import lombok.extern.slf4j.Slf4j;

/**
 * TODO 判断是临时有效的STS还是长期有效的AKSK
 *
 * <p>
 * 测试通过case：
 * 1. 无效aksk
 * 2. 有效aksk
 * 3. 被禁用的aksk
 *
 * @author CC11001100
 */
@Slf4j
public class AliCloudAkskOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

        if (!task.hasAkSk()) {
            return OnlineTestResult.failed(AuthType.AKSK);
        }

        DefaultProfile profile = DefaultProfile.getProfile(AliCloudConstant.REGION);
        DefaultAcsClient client = new DefaultAcsClient(profile,
                new BasicCredentials(task.getAccessKey(), task.getSecretKey()));

        DescribeInstancesRequest request = new DescribeInstancesRequest();
        try {
            DescribeInstancesResponse response = client.getAcsResponse(request);
            // 2024-07-26 00:43:28 似乎这里不抛出异常就可以认为是成功的
//            List<DescribeInstancesResponse.Instance> instances = response.getInstances();
//            if (CollectionUtils.isEmpty(instances)) {
//                return OnlineTestResult.failed(AuthType.AKSK);
//            }
            return OnlineTestResult.builder().authType(AuthType.AKSK).isAuthSuccess(true).extra(response).build();
        } catch (ClientException e) {
            log.error("Testing the validity of the Alibaba Cloud AKSK credentials results in an exception: {}", e.getMessage());
            return OnlineTestResult.failed(AuthType.AKSK).setDescription(e.getMessage());
        }
    }

}
