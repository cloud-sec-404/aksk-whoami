package com.github.cloudsec.akskwhoami.service.impl.qiniucloud;

import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.util.Auth;

/**
 *
 * TODO 2024-07-27 00:37:19 测试七牛云的aksk
 *
 * https://developer.qiniu.com/kodo/sdk/java
 *
 * @author CC11001100
 */
public class QiNiuOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

        try {
            Auth auth = Auth.create(task.getAccessKey(), task.getSecretKey());
            Configuration cfg = new Configuration();
            BucketManager bucketManager = new BucketManager(auth, cfg);
            String[] buckets = bucketManager.buckets();
            return OnlineTestResult.successWithExtra(buckets);
        } catch (Exception e) {
            return OnlineTestResult.failedWithDescription(e.getMessage());
        }
    }

}
