package com.github.cloudsec.akskwhoami.service.impl.alicloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;

/**
 * @author CC11001100
 */
public class FooServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "foo";
    }

    @Override
    public String getProductUrl() {
        return "https://foo.com";
    }

}
