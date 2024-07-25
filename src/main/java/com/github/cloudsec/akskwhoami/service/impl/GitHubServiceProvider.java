package com.github.cloudsec.akskwhoami.service.impl;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;
import org.kohsuke.github.GitHub;

import java.io.IOException;

/**
 * @author CC11001100
 */
public class GitHubServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getProductUrl() {
        return "";
    }

    @Override
    public OnlineTestResult executeOnlineTestForOneResult(TestTask task) throws ServiceProviderTestException {
        try {
            GitHub github = GitHub.connect();
            github.checkAuth(task.getAccessKey(), task.getSecretKey());
        } catch (IOException e) {
            throw new ServiceProviderTestException(e);
        }
        return null;
    }

}
