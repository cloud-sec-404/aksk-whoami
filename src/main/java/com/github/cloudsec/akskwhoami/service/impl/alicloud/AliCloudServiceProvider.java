package com.github.cloudsec.akskwhoami.service.impl.alicloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.OnlineTestJob;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 阿里云
 *
 * @author CC11001100
 */
public class AliCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "阿里云";
    }

    @Override
    public String getProductUrl() {
        return "https://cn.aliyun.com/";
    }

    @Override
    public List<OnlineTestJob> getOnlineTestJobs() {
        return Lists.newArrayList(
                new AliCloudAkskOnlineTestJob(),
                new AliCloudBearerTokenOnlineTestJob()
        );
    }

}
