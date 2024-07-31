package com.github.cloudsec.akskwhoami.service.impl.chinatelecomcloud;

import com.github.cloudsec.akskwhoami.service.base.AbstractServiceProvider;
import com.github.cloudsec.akskwhoami.service.base.job.OfflineTestJob;

/**
 *
 * 中国电信云 (China Telecom Cloud)
 *
 * TODO 跟天翼云是一回事吗？？？
 *
 *
 * @author CC11001100
 */
public class ChinaTelecomCloudServiceProvider extends AbstractServiceProvider {

    @Override
    public String getName() {
        return "中国电信云";
    }

    @Override
    public String getProductUrl() {
        return "https://www.ctyun.cn/";
    }

    @Override
    public OfflineTestJob getOfflineTestJob() {
        return new ChinaTelecomCloudOfflineTestJob();
    }

}
