package com.github.cloudsec.akskwhoami.service.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @author CC11001100
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OfflineTestResult {

    /**
     * 认证类型
     */
    private String authType;

    /**
     * 结果置信度，取值[0, 1]的区间
     */
    private double confidence;

    /**
     * 可能会跟着一个对置信度的原因描述之类的
     */
    private String description;

    /**
     * 可能会跟着额外的信息
     */
    private Object extra;

    /**
     * @return
     */
    public static OfflineTestResult failed() {
        return OfflineTestResult.builder().build();
    }

    public String getAuthType() {
        return authType;
    }

    public OfflineTestResult setAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    public double getConfidence() {
        return confidence;
    }

    public OfflineTestResult setConfidence(double confidence) {
        this.confidence = confidence;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfflineTestResult setDescription(String description) {
        this.description = description;
        return this;
    }

    public Object getExtra() {
        return extra;
    }

    public OfflineTestResult setExtra(Object extra) {
        this.extra = extra;
        return this;
    }

}
