package com.github.cloudsec.akskwhoami.service.impl.github;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;

/**
 *
 * 测试GitHub的认证服务
 *
 * @author CC11001100
 */
public class GitHubServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "GitHub";
    }

    @Override
    public String getProductUrl() {
        return "https://github.com/";
    }

    @Override
    public OnlineTestJob getOnlineTestJob() {
        return new GitHubOnlineTestJob();
    }

}
