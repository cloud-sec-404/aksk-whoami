package com.github.cloudsec.akskwhoami.executor.concurrency;

import me.tongfei.progressbar.ProgressBar;

/**
 * @author CC11001100
 */
public class TaskExecutorProgressBar extends ProgressBar {

    private int doneCount;

    public TaskExecutorProgressBar(String task, long initialMax) {
        super(task, initialMax);
    }

    public void done() {
        if (this.doneCount < super.getMax()) {
            this.doneCount++;
        }
        this.stepTo(this.doneCount);
        this.refresh();
    }

}
