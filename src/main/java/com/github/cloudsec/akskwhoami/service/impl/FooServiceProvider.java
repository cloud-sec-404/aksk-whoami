package com.github.cloudsec.akskwhoami.service.impl;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.ServiceProviderTestException;
import com.github.cloudsec.akskwhoami.service.domain.OfflineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 * @author CC11001100
 */
public class FooServiceProvider extends AbstractServiceProvider {

    @Override
    public OfflineTestResult executeOfflineTestForOneResult(TestTask task) throws ServiceProviderTestException {
        return OfflineTestResult.builder().confidence(1).build();
    }

    @Override
    public String getName() {
        return "foo";
    }

    @Override
    public String getProductUrl() {
        return "https://foo.com";
    }

}
