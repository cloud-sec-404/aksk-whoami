package com.github.cloudsec.akskwhoami.service.task;

import com.github.cloudsec.akskwhoami.service.constants.NetworkMode;
import com.google.common.collect.Sets;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.Set;

/**
 * aksk测试任务
 *
 * @author CC11001100
 */
@Data
public class TestTask {

    /**
     * 此测试任务允许的网络模式，默认情况下允许联网和离线都测试一下
     */
    private Set<NetworkMode> allowNetworkModes = Sets.newHashSet(NetworkMode.ONLINE, NetworkMode.OFFLINE);

    /**
     * 要测试的access key
     */
    @Nullable
    private String accessKey;

    /**
     * 要测试的secret key
     */
    @Nullable
    private String secretKey;

    // -----------------------------------------------------------------------------------------------------------------

    /**
     * 是否允许在线网络模式检测
     *
     * @return
     */
    public boolean isAllowOnlineNetworkMode() {
        return allowNetworkModes != null && allowNetworkModes.contains(NetworkMode.ONLINE);
    }

    /**
     * 是否允许离线网络模式检测
     *
     * @return
     */
    public boolean isAllowOfflineNetworkMode() {
        return allowNetworkModes != null && allowNetworkModes.contains(NetworkMode.OFFLINE);
    }

    /**
     * 是否没有配置ak或者sk
     *
     * @return
     */
    public boolean notHasAkOrSk() {
        return !this.hasAkAndSk();
    }


    /**
     * 是否同时设置了ak和sk
     *
     * @return
     */
    public boolean hasAkAndSk() {
        return this.hasAk() && this.hasSk();
    }

    /**
     * 是否设置了ak
     *
     * @return
     */
    public boolean hasAk() {
        return StringUtils.isNotBlank(this.accessKey);
    }

    /**
     * 是否没有设置sk
     *
     * @return
     */
    public boolean notHasSk() {
        return !this.hasSk();
    }

    /**
     * 是否设置了sk
     *
     * @return
     */
    public boolean hasSk() {
        return StringUtils.isNotBlank(this.secretKey);
    }

}
