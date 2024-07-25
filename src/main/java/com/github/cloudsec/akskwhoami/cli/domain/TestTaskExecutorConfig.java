package com.github.cloudsec.akskwhoami.cli.domain;

import com.github.cloudsec.akskwhoami.service.domain.TestTask;
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

}
