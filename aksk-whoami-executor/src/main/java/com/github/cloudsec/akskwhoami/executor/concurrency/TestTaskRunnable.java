package com.github.cloudsec.akskwhoami.executor.concurrency;

import com.github.cloudsec.akskwhoami.executor.event.TaskTestEventListener;
import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.result.TestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

/**
 * @author CC11001100
 */
@Slf4j
@Data
public class TestTaskRunnable implements Runnable {

    private TestTask task;

    private ServiceProvider serviceProvider;

    private List<TaskTestEventListener> listeners;

    public TestTaskRunnable(TestTask task, ServiceProvider serviceProvider, List<TaskTestEventListener> listeners) {
        this.task = task;
        this.serviceProvider = serviceProvider;
        this.listeners = listeners;
    }

    @Override
    public void run() {
        try {
            TestResult result = this.serviceProvider.test(task);
            if (CollectionUtils.isNotEmpty(this.listeners)) {
                for (TaskTestEventListener listener : listeners) {
                    listener.onSingleServiceProviderDone(task, serviceProvider, result, null);
                }
            }
        } catch (Exception e) {
            if (CollectionUtils.isNotEmpty(this.listeners)) {
                for (TaskTestEventListener listener : listeners) {
                    listener.onSingleServiceProviderDone(task, serviceProvider, null, e);
                }
            }
        }
    }

}
