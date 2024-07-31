package com.github.cloudsec.akskwhoami.service.impl.baiducloud;

import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.bos.BosClient;
import com.baidubce.services.bos.BosClientConfiguration;
import com.baidubce.services.bos.model.BucketSummary;
import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

import java.util.List;

/**
 * https://cloud.baidu.com/doc/BOS/s/4jwvyrq6p
 *
 * @author CC11001100
 */
public class BaiduCloudOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

        if (task.notHasAkAndSk()) {
            return OnlineTestResult.failed();
        }

        try {
            // 初始化一个BosClient
            BosClientConfiguration config = new BosClientConfiguration();
            config.setCredentials(new DefaultBceCredentials(task.getAccessKey(), task.getSecretKey()));
            BosClient client = new BosClient(config);

            // 获取用户的Bucket列表
            List<BucketSummary> buckets = client.listBuckets().getBuckets();
            return OnlineTestResult.successWithExtra(buckets);
        } catch (Exception e) {
            return OnlineTestResult.failedWithDescription(e.getMessage());
        }
    }

}
