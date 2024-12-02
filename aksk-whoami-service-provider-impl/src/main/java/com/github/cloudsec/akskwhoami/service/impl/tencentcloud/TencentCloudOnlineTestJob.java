package com.github.cloudsec.akskwhoami.service.impl.tencentcloud;

import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.validator.TestTaskAkSkValidator;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;

/**
 *
 * TODO 2024-07-27 00:21:13 腾讯云aksk测试
 *
 * @author CC11001100
 */
public class TencentCloudOnlineTestJob implements OnlineTestJob {

    @TestTaskAkSkValidator
    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {
        try {
            Credential cred = new Credential(task.getAccessKey(), task.getSecretKey());
            CvmClient client = new CvmClient(cred, "ap-shanghai");
            DescribeInstancesRequest req = new DescribeInstancesRequest();
            DescribeInstancesResponse resp = client.DescribeInstances(req);
            return OnlineTestResult.successWithExtra(DescribeInstancesResponse.toJsonString(resp));
        } catch (Exception e) {
            return OnlineTestResult.failedWithDescription(e.getMessage());
        }
    }

}
