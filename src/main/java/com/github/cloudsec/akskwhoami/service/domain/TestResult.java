package com.github.cloudsec.akskwhoami.service.domain;

import lombok.Data;

import javax.annotation.Nullable;
import java.util.List;

/**
 * 用于表示aksk任务测试结果
 *
 * @author CC11001100
 */
@Data
public class TestResult {

    /**
     * ak在此服务商可能有自己的叫法
     */
    @Nullable
    private String accessKeyAliasName;

    /**
     * sk在此服务商可能有自己的叫法
     */
    @Nullable
    private String secretKeyAliasName;

    /**
     * 凭证的联网测试结果
     */
    @Nullable
    private List<OnlineTestResult> onlineTestResultList;

    /**
     * 凭证的离线测试结果
     */
    @Nullable
    private List<OfflineTestResult> offlineTestResultList;

    /**
     * 可以携带一些自定义的额外信息
     */
    @Nullable
    private Object extra;

}
