package com.github.cloudsec.akskwhoami.service.base;

import com.github.cloudsec.akskwhoami.service.domain.OfflineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestResult;
import com.github.cloudsec.akskwhoami.service.domain.TestTask;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 接口的适配，把抽象粒度搞细
 *
 * @author CC11001100
 */
public abstract class AbstractServiceProvider implements ServiceProvider {

    // -------------------------------------------------------------------------------------------------------------------------------------

    public static final long INIT_VERSION = 1;

    @Override
    public long getVersion() {
        return INIT_VERSION;
    }


    // -------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public TestResult test(TestTask task) throws ServiceProviderTestException {

        TestResult result = new TestResult();

        if (task.isAllowOfflineNetworkMode()) {
            result.setOfflineTestResultList(this.executeOfflineTest(task));
        }

        if (task.isAllowOnlineNetworkMode()) {
            result.setOnlineTestResultList(this.executeOnlineTest(task));
        }

        return result;
    }

    // -------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 如果是一批需要联网的job，则在此处配置
     *
     * @return
     */
    public List<OnlineTestJob> getOnlineTestJobs() {
        return Collections.emptyList();
    }

    /**
     * 如果是一个需要联网的job，则在此处配置
     *
     * @return
     */
    public OnlineTestJob getOnlineTestJob() {
        return null;
    }

    /**
     * 执行联网测试，可能会调用不同的接口，返回多个结果
     *
     * @param task
     * @return
     */
    public List<OnlineTestResult> executeOnlineTest(TestTask task) throws ServiceProviderTestException {

        List<OnlineTestResult> resultList = new ArrayList<>();

        // 执行一个
        OnlineTestJob job = this.getOnlineTestJob();
        if (job != null) {
            OnlineTestResult result = job.execute(task);
            if (result != null) {
                resultList.add(result);
            }
        }

        // 执行一批
        List<OnlineTestJob> onlineTestJobs = this.getOnlineTestJobs();
        if (CollectionUtils.isNotEmpty(onlineTestJobs)) {
            for (OnlineTestJob onlineTestJob : onlineTestJobs) {
                OnlineTestResult result = onlineTestJob.execute(task);
                if (result != null) {
                    resultList.add(result);
                }
            }
        }

        return resultList;
    }

    // -------------------------------------------------------------------------------------------------------------------------------------

    /**
     * @return
     */
    public List<OfflineTestJob> getOfflineTestJobs() {
        return Collections.emptyList();
    }

    /**
     * @return
     */
    public OfflineTestJob getOfflineTestJob() {
        return null;
    }

    /**
     * 执行离线测试，可能返回多个结果
     *
     * @param task
     * @return
     */
    public List<OfflineTestResult> executeOfflineTest(TestTask task) throws ServiceProviderTestException {
        List<OfflineTestResult> resultList = new ArrayList<>();

        // 执行一个
        OfflineTestJob job = this.getOfflineTestJob();
        if (job != null) {
            OfflineTestResult result = job.execute(task);
            if (result != null) {
                resultList.add(result);
            }
        }

        // 执行一批
        List<OfflineTestJob> offlineTestJobs = this.getOfflineTestJobs();
        if (CollectionUtils.isNotEmpty(offlineTestJobs)) {
            for (OfflineTestJob offlineTestJob : offlineTestJobs) {
                OfflineTestResult result = offlineTestJob.execute(task);
                if (result != null) {
                    resultList.add(result);
                }
            }
        }

        return resultList;
    }

    // -------------------------------------------------------------------------------------------------------------------------------------

    public static final String DEFAULT_ACCESS_KEY_SHOW_NAME = "Access key";

    @Override
    public String getAccessKeyAliasName() {
        return DEFAULT_ACCESS_KEY_SHOW_NAME;
    }

    public static final String DEFAULT_SECRET_KEY_SHOW_NAME = "Secret key";

    @Override
    public String getSecureKeyAliasName() {
        return DEFAULT_SECRET_KEY_SHOW_NAME;
    }

    // -------------------------------------------------------------------------------------------------------------------------------------

}
