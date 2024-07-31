package com.github.cloudsec.akskwhoami.executor.callback;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.domain.TestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;

/**
 *
 * 把结果输出到文本文件
 *
 * @author CC11001100
 */
public class TextFileTaskTestDoneCallback implements TaskTestDoneCallback {

    @Override
    public void apply(TestTask task, ServiceProvider serviceProvider, TestResult result, Exception e) {
        // TODO
    }

}
