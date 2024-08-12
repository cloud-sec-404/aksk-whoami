package com.github.cloudsec.akskwhoami.service.impl.alicloud.kingsoftcloud;

import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.validator.TestTaskAkSkValidator;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import com.ksyun.ks3.dto.Bucket;
import com.ksyun.ks3.service.Ks3;
import com.ksyun.ks3.service.Ks3Client;
import com.ksyun.ks3.service.Ks3ClientConfig;

import java.util.List;

/**
 *
 * TODO 2024-08-02 01:25:13 测试金山云的aksk
 *
 * https://docs.ksyun.com/documents/40558
 *
 * @author CC11001100
 */
public class KingSoftCloudOnlineTestJob implements OnlineTestJob {

    /**
     * yourEndpoint填写Bucket所在地域对应的Endpoint。以中国（北京）为例，Endpoint填写为ks3-cn-beijing.ksyuncs.com。如果使用自定义域名，设置endpoint为自定义域名，同时设置domainMode为true
     */
    public static String endpoint = "ks3-cn-beijing.ksyuncs.com";

    @TestTaskAkSkValidator
    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

        // 金山云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用子账号账号进行 API 访问或日常运维，请登录 https://uc.console.ksyun.com/pro/iam/#/user/list 创建子账号。
//        String accessKeyId = "yourAccessKeyId";
//        String accessKeySecret = "yourAccessKeySecret";
        // 创建Ks3ClientConfig 实例。
        Ks3ClientConfig config = new Ks3ClientConfig();
        // 设置域名
        config.setEndpoint(endpoint);
        // 创建Ks3Client实例
        Ks3 client = new Ks3Client(task.getAccessKey(), task.getSecretKey(), config);
        // 桶列表信息
        List<Bucket> buckets = client.listBuckets();
        return OnlineTestResult.successWithExtra(buckets);
    }

}
