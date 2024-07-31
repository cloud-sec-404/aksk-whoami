package com.github.cloudsec.akskwhoami.service.impl.ucloud;

import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.udisk.client.UDiskClient;
import cn.ucloud.udisk.models.DescribeUDiskRequest;
import cn.ucloud.udisk.models.DescribeUDiskResponse;
import com.github.cloudsec.akskwhoami.service.base.AuthType;
import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;
import lombok.extern.slf4j.Slf4j;

/**
 * TODO 2024-07-27 00:47:49 测试ucloud的公钥、私钥体系
 * <p>
 * <p>
 * https://github.com/ucloud/ucloud-sdk-java/blob/master/docs/quickstart.md
 *
 * @author CC11001100
 */
@Slf4j
public class UCloudOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

        Credential credential = new Credential(task.getAccessKey(), task.getSecretKey());
        Config config = new Config();
        config.setRegion("cn-bj2");
        // TODO 这个项目ID如何传递呢？
        config.setProjectId("org-xxx");
        UDiskClient client = new UDiskClient(config, credential);
        DescribeUDiskRequest req = new DescribeUDiskRequest();
        req.setOffset(0);
        req.setLimit(10);
        DescribeUDiskResponse resp = null;
        try {
            resp = client.describeUDisk(req);
            return OnlineTestResult.successWithExtra(resp);
        } catch (Exception e) {
            return OnlineTestResult.failed(AuthType.PUBLIC_PRIVATE_KEY);
        }
    }

}
