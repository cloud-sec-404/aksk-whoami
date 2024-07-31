package com.github.cloudsec.akskwhoami.service.impl.huaweicloud;

import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.vpc.v2.VpcClient;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v2.model.ListVpcsResponse;
import com.huaweicloud.sdk.vpc.v2.region.VpcRegion;


/**
 * TODO 2024-07-27 20:41:42 测试华为云的aksk
 *
 * @author CC11001100
 */
public class HuaWeiCloudOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {
        try {

            // 配置认证信息
            // 可通过环境变量等方式配置认证信息，参考2.4认证信息管理章节
            ICredential auth = new BasicCredentials()
                    .withAk(System.getenv(task.getAccessKey()))
                    .withSk(System.getenv(task.getSecretKey()));

            // 创建服务客户端
            VpcClient client = VpcClient.newBuilder()
                    .withCredential(auth)
                    .withRegion(VpcRegion.valueOf("cn-north-4"))
                    .build();

            // 发送请求并获取响应
            ListVpcsRequest request = new ListVpcsRequest();
            ListVpcsResponse response = client.listVpcs(request);
            return OnlineTestResult.successWithExtra(response);
        } catch (Exception e) {
            return OnlineTestResult.failedWithDescription(e.getMessage());
        }
    }

}
