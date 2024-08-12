package com.github.cloudsec.akskwhoami.cli.domain;

import com.github.cloudsec.akskwhoami.service.task.TestTask;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 执行token测试任务时的参数配置
 *
 * @author CC11001100
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TestTaskExecutorConfig extends TestTask {

    // TODO 2024-08-01 00:51:11 支持指定并发数，不过目前来看对接的平台不多，没什么必要...

}
