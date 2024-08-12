package com.github.cloudsec.akskwhoami.executor.event;

import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.result.TestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import me.tongfei.progressbar.ProgressBar;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 任务执行时在控制台上展示进度条
 *
 * @author CC11001100
 */
public class TerminalShowProgressBarEventListener extends AbstractTaskTestEventListener {

    private ProgressBar progressBar;

    /**
     * 进度条当前走完了多长
     */
    private final AtomicInteger doneCount = new AtomicInteger(0);

    /**
     * 每执行完一个任务的时候调用一次这个方法
     */
    public void done() {

        // 防止发生乱七八糟的事导致越界了
        if (this.doneCount.get() < progressBar.getMax()) {
            this.doneCount.incrementAndGet();
        }

        this.progressBar.stepTo(this.doneCount.get());
        this.progressBar.refresh();
    }

    @Override
    public void onSubmit(TestTask task) {

    }

    @Override
    public void onTestTaskSelector(TestTask task, List<ServiceProvider> serviceProviderList) {
        this.progressBar = new ProgressBar("Aksk Test Task", serviceProviderList.size());
    }

    @Override
    public void onSingleServiceProviderDone(TestTask task, ServiceProvider serviceProvider, TestResult result, Exception e) {
        this.done();
    }

}
