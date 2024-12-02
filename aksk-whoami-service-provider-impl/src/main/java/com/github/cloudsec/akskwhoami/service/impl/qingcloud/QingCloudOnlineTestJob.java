package com.github.cloudsec.akskwhoami.service.impl.qingcloud;

import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.validator.TestTaskAkSkValidator;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import com.qingstor.sdk.config.EnvContext;
import com.qingstor.sdk.exception.QSException;
import com.qingstor.sdk.service.QingStor;

/**
 *
 * TODO 青云aksk测试
 *
 * @author CC11001100
 */
public class QingCloudOnlineTestJob implements OnlineTestJob {

    @TestTaskAkSkValidator
    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {
        EnvContext env = new EnvContext("ACCESS_KEY_ID", "SECRET_ACCESS_KEY");
        QingStor stor = new QingStor(env);
        QingStor.ListBucketsOutput listBucketsOutput = null;
        try {
            listBucketsOutput = stor.listBuckets(null);
            return OnlineTestResult.successWithExtra(listBucketsOutput);
        } catch (QSException e) {
            return OnlineTestResult.failedWithDescription(e.getErrorMessage());
        }
    }

}
