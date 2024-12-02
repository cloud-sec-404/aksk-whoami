package com.github.cloudsec.akskwhoami.service.impl.volcengine;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OfflineTestJob;

/**
 *
 * 字节跳动的火山云引擎
 *
 * TODO 草，这也太傻逼了，SDK怎么还是私有仓库.... https://github.com/volcengine/volcengine-java-sdk
 *
 *
 * @author CC11001100
 */
public class VolcEngineServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "火山引擎";
    }

    @Override
    public String getProductUrl() {
        return "https://www.volcengine.com/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new VolcEngineOfflineTestJob();
    }

}
