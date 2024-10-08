package com.github.cloudsec.akskwhoami.executor.selector;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.task.TestTask;

import java.util.List;

/**
 * 用于选择运行哪些服务商来测试任务
 *
 * @author CC11001100
 */
@FunctionalInterface
public interface ServiceProviderSelector {

    /**
     * 根据任务选择不同的加载器
     *
     * @param task
     * @return
     */
    List<ServiceProvider> select(TestTask task);

}
