package com.github.cloudsec.akskwhoami.executor.concurrency;

import me.tongfei.progressbar.ProgressBar;

/**
 * 任务执行时的进度条
 *
 * @author CC11001100
 */
public class TaskExecutorProgressBar extends ProgressBar {

    /**
     * 进度条当前走完了多长
     */
    private int doneCount;

    /**
     * @param task       进度条的名字
     * @param initialMax 进度条总共有多长
     */
    public TaskExecutorProgressBar(String task, long initialMax) {
        super(task, initialMax);
    }

    /**
     * 每执行完一个任务的时候调用一次这个方法
     */
    public void done() {

        // 防止发生乱七八糟的事导致越界了
        if (this.doneCount < super.getMax()) {
            this.doneCount++;
        }

        this.stepTo(this.doneCount);
        this.refresh();
    }

}
