package com.github.cloudsec.akskwhoami.service.impl.github;

import com.github.cloudsec.akskwhoami.service.base.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;
import lombok.extern.slf4j.Slf4j;
import org.kohsuke.github.GHAuthorization;
import org.kohsuke.github.GitHub;

/**
 *
 * TODO 2024-07-26 23:48:51 测试GitHub Token
 *
 * @author CC11001100
 */
@Slf4j
public class GitHubOnlineTestJob implements OnlineTestJob {

    @Override
    public OnlineTestResult execute(TestTask task) throws ServiceProviderTestException {
        try {
            GitHub github = GitHub.connect();
            GHAuthorization authorization = github.checkAuth(task.getAccessKey(), task.getSecretKey());
            return OnlineTestResult.successWithExtra(authorization);
        } catch (Exception e) {
            return OnlineTestResult.failed().setDescription(e.getMessage());
        }
    }

}
