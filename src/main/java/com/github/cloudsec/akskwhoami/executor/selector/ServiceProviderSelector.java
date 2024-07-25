package com.github.cloudsec.akskwhoami.executor.selector;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

import java.util.List;

/**
 * 用于选择运行哪些查询器
 *
 * @author CC11001100
 */
public interface ServiceProviderSelector {

    /**
     * 根据任务选择不同的加载器
     *
     * @param task
     * @return
     */
    List<ServiceProvider> select(TestTask task);

}
