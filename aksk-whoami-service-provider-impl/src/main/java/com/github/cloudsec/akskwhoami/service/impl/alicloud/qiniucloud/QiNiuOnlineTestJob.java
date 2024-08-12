package com.github.cloudsec.akskwhoami.service.impl.alicloud.qiniucloud;

import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.validator.TestTaskAkSkValidator;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
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

    @TestTaskAkSkValidator
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
