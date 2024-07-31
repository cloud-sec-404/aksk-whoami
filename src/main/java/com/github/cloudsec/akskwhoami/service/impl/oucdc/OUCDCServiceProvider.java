package com.github.cloudsec.akskwhoami.service.impl.oucdc;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.job.OfflineTestJob;

/**
 *
 * TODO 这是啥？抄过来了，但是很懵逼？？？
 *
 * 南大通用云 (OUCDC)
 *
 * @author CC11001100
 */
public class OUCDCServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getProductUrl() {
        return "";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new OUCDCOfflineTestJob();
    }

}
