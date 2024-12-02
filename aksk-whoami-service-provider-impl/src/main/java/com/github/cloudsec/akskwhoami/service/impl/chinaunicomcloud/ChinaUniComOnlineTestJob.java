package com.github.cloudsec.akskwhoami.service.impl.chinaunicomcloud;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.model.Bucket;
import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;

import java.util.List;

/**
 * 联网测试联通云的aksk
 *
 * @author CC11001100
 */
public class ChinaUniComOnlineTestJob implements OnlineTestJob {

    /**
     * 要连接的oss端点
     */
    private final static String ENDPOINT = "https://obs-helf.cucloud.cn";

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

        if (task.notHasAkOrSk()) {
            return OnlineTestResult.failed();
        }

        BasicAWSCredentials basicAwsCred = new BasicAWSCredentials(task.getAccessKey(), task.getSecretKey()); //请替换成您的AccessKey和SecretKey
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setProtocol(Protocol.HTTPS);
        AmazonS3Client s3 = new AmazonS3Client(basicAwsCred, clientConfiguration);
        S3ClientOptions options = S3ClientOptions.builder().setPathStyleAccess(true).setPayloadSigningEnabled(true).disableChunkedEncoding().build();
        s3.setS3ClientOptions(options);
        s3.setEndpoint(ENDPOINT);
        List<Bucket> buckets = s3.listBuckets();
        return OnlineTestResult.successWithExtra(buckets);
    }

}
