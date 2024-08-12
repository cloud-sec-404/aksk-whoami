package com.github.cloudsec.akskwhoami.executor.event;

import com.alibaba.fastjson2.JSON;
import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.result.TestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

/**
 * @author CC11001100
 */
@Slf4j
public class JsonFileTaskTestEventListener extends AbstractTaskTestEventListener {

    /**
     * 把结果输出到哪个文件中
     */
    private final String outputJsonFilePath;

    /**
     *
     * @param outputJsonFilePath 要保存到的json文件的绝对路径
     */
    public JsonFileTaskTestEventListener(String outputJsonFilePath) {
        this.outputJsonFilePath = outputJsonFilePath;
    }

    @Override
    public void onSingleServiceProviderDone(TestTask task, ServiceProvider serviceProvider, TestResult result, Exception e) {
        TaskTestJsonResult r = new TaskTestJsonResult();
        r.setTask(task);
        r.setServiceProvider(serviceProvider);
        r.setResult(result);
        String line = JSON.toJSONString(r);
        try {
            FileUtils.writeLines(new File(outputJsonFilePath), Collections.singleton(line));
        } catch (IOException ex) {
            log.error("write result to file {} error: {}", this.outputJsonFilePath, e.getMessage());
        }
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TaskTestJsonResult {

        /**
         * 被测试的任务
         */
        private TestTask task;

        /**
         * 使用哪个服务厂商来测试
         */
        private ServiceProvider serviceProvider;

        /**
         * 测试的结果是啥
         */
        private TestResult result;

    }

}
