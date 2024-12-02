package com.github.cloudsec.akskwhoami.service.impl.aws;

import com.github.cloudsec.akskwhoami.service.constants.AuthType;
import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.validator.TestTaskAkSkValidator;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;


/**
 * TODO 对接aws的sdk
 *
 * @author CC11001100
 */
public class AwsOnlineTestJob implements OnlineTestJob {

    @TestTaskAkSkValidator
    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

        AwsBasicCredentials awsCreds = AwsBasicCredentials.create(task.getAccessKey(), task.getSecretKey());
        S3Client s3 = S3Client.builder()
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .region(Region.CN_NORTHWEST_1) // 根据需要更改区域
                .build();

        try {
            ListBucketsResponse listBucketsResponse = s3.listBuckets();
            return OnlineTestResult.successWithExtra(listBucketsResponse);
        } catch (Exception e) {
            return OnlineTestResult.failed(AuthType.AKSK).setDescription(e.getMessage());
        }
    }

}
