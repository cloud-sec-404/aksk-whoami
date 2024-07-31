package com.github.cloudsec.akskwhoami.service.impl.tencentcloud;

import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;
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

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

        if (task.notHasAkAndSk()) {
            return OnlineTestResult.failed();
        }

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
