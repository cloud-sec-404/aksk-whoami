package com.github.cloudsec.akskwhoami.service.impl.yiyuntong;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.job.OfflineTestJob;

/**
 * 一云通 (YiYunTong)
 *
 * @author CC11001100
 */
public class YiYunTongServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "一云通";
    }

    @Override
    public String getProductUrl() {
        return "https://www.yiyuntong.com/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new YiYunTongOfflineTestJob();
    }

}
