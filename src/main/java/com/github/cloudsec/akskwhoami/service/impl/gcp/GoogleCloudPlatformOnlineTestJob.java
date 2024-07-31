package com.github.cloudsec.akskwhoami.service.impl.gcp;

import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;


import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

import java.io.IOException;


/**
 * @author CC11001100
 */
public class GoogleCloudPlatformOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {

//        try {
//            // TODO 这个token到底是咋设置的啊...
////            new AccessToken()
////            GoogleCredentials credentials = GoogleCredentials.fromStream(
////                    new FileInputStream("path/to/your/service-account-file.json")
////            );
//
//            GoogleCredentials.create()
//
//            Storage storage = StorageOptions.newBuilder()
//                    .setCredentials(credentials)
//                    .build()
//                    .getService();
//
//            // 测试列出存储桶
//            System.out.println("Storage Buckets:");
//            for (Storage.Bucket bucket : storage.list().iterateAll()) {
//                System.out.println(bucket.getName());
//            }
//        } catch (IOException e) {
//            System.err.println("Error: " + e.getMessage());
//        }


        return null;
    }

}
