package com.github.cloudsec.akskwhoami.service.impl.github;

import com.github.cloudsec.akskwhoami.service.job.OnlineTestJob;
import com.github.cloudsec.akskwhoami.service.exception.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
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
