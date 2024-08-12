package com.github.cloudsec.akskwhoami.service.impl.alicloud.azure;

import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;


/**
 * @author CC11001100
 */
public class AzureOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

        // TODO
//        // 配置 Azure 凭证
//        String clientId = "你的客户端ID";
//        String clientSecret = "你的客户端密钥";
//        String tenantId = "你的租户ID";
//        String subscriptionId = "你的订阅ID";
//
//        // 创建客户端密钥凭证
//        ClientSecretCredential credential = new ClientSecretCredentialBuilder()
//                .clientId(clientId)
//                .clientSecret(clientSecret)
//                .tenantId(tenantId)
//                .authority(AzureAuthorityHosts.AZURE_PUBLIC_CLOUD)
//                .build();
//
//        // 创建 Azure 资源管理器
//        Configurable configurable = AzureResourceManager.configure()
//                .withLogLevel(HttpLogDetailLevel.BASIC)
//                .authenticate(credential, AzureAuthorityHosts.AZURE_PUBLIC_CLOUD);
//
//        AzureResourceManager azureResourceManager = configurable.build();
//
//        try {
//            // 列出所有存储账户
//            System.out.println("Listing storage accounts:");
//            for (StorageAccount storageAccount : azureResourceManager.storageAccounts().list()) {
//                System.out.println(storageAccount.name());
//            }
//        } catch (Exception e) {
//            System.err.println("Error: " + e.getMessage());
//        }

        return null;
    }

}
