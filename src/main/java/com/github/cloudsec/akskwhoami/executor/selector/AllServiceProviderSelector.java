package com.github.cloudsec.akskwhoami.executor.selector;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/**
 * 默认情况下使用所有的ServiceProvider实现都检测一遍
 *
 * @author CC11001100
 */
public class AllServiceProviderSelector implements ServiceProviderSelector {

    @Override
    public List<ServiceProvider> select(TestTask task) {
        ServiceLoader<ServiceProvider> serviceProviders = ServiceLoader.load(ServiceProvider.class);
        Iterator<ServiceProvider> iterator = serviceProviders.iterator();
        List<ServiceProvider> serviceProviderList = new ArrayList<>();
        while (iterator.hasNext()) {
            serviceProviderList.add(iterator.next());
        }
        return serviceProviderList;
    }

}
