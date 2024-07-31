package com.github.cloudsec.akskwhoami.service.impl.aws;

import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;


/**
 *
 * TODO 对接aws的sdk
 *
 * @author CC11001100
 */
public class AwsOnlineTestJob implements OnlineTestJob  {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

//        AwsBasicCredentials awsCreds = AwsBasicCredentials.create(accessKeyId, secretAccessKey);
//        S3Client s3 = S3Client.builder()
//                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
//                .region(Region.CN_NORTHWEST_1) // 根据需要更改区域
//                .build();
//
//        try {
//            ListBucketsRequest listBucketsRequest = ListBucketsRequest.builder().build();
//            s3.listBuckets(listBucketsRequest).buckets().forEach(bucket ->
//                    System.out.println(bucket.name())
//            );
//        } catch (Exception e) {
//            System.err.println("Error: " + e.getMessage());
//        }

        return null;
    }

}
