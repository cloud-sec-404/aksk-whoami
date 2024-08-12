package com.github.cloudsec.akskwhoami.service.impl.alicloud.baiducloud;

import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.bos.BosClient;
import com.baidubce.services.bos.BosClientConfiguration;
import com.baidubce.services.bos.model.BucketSummary;
import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;

import java.util.List;

/**
 * https://cloud.baidu.com/doc/BOS/s/4jwvyrq6p
 *
 * @author CC11001100
 */
public class BaiduCloudOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

        if (task.notHasAkOrSk()) {
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
