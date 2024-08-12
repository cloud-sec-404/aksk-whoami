package com.github.cloudsec.akskwhoami.service.result;

import com.github.cloudsec.akskwhoami.service.constants.AuthType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * 用于表示联网测试结果
 *
 * @author CC11001100
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineTestResult {

    /**
     * 凭证类型
     */
    private String authType;

    /**
     * 凭证是否认证成功
     */
    private boolean isAuthSuccess;

    /**
     * 可能会跟着一个描述信息啥的
     */
    private String description;

    /**
     * 可能会携带的一些外信息，比如联网测试结果可以放在这里
     */
    private Object extra;

    public String getAuthType() {
        return authType;
    }

    public OnlineTestResult setAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    public boolean isAuthSuccess() {
        return isAuthSuccess;
    }

    public OnlineTestResult setAuthSuccess(boolean authSuccess) {
        isAuthSuccess = authSuccess;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OnlineTestResult setDescription(String description) {
        this.description = description;
        return this;
    }

    public Object getExtra() {
        return extra;
    }

    public OnlineTestResult setExtra(Object extra) {
        this.extra = extra;
        return this;
    }

    /**
     * @param extra
     * @return
     */
    public static OnlineTestResult successWithExtra(Object extra) {
        return OnlineTestResult.builder().isAuthSuccess(true).extra(extra).build();
    }

    /**
     * @return
     */
    public static OnlineTestResult failedWithDescription(String description) {
        return failed().setDescription(description);
    }

    /**
     * @return
     */
    public static OnlineTestResult failed() {
        return failed(AuthType.AKSK);
    }

    /**
     * @param authType
     * @return
     */
    public static OnlineTestResult failed(String authType) {
        return OnlineTestResult.builder().isAuthSuccess(false).authType(authType).build();
    }

}
