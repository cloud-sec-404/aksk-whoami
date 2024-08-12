package com.github.cloudsec.akskwhoami.executor.selector;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.task.TestTask;

import java.util.List;

/**
 *
 * 只测试给定的服务商
 *
 * @author CC11001100
 */
public class CustomServiceProviderSelector implements ServiceProviderSelector  {

    private final List<ServiceProvider> serviceProviderList;

    public CustomServiceProviderSelector(List<ServiceProvider> serviceProviderList) {
        this.serviceProviderList = serviceProviderList;
    }

    @Override
    public List<ServiceProvider> select(TestTask task) {
        return this.serviceProviderList;
    }

}
