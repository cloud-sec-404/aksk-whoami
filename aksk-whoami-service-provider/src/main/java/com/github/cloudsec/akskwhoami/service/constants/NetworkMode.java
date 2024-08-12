package com.github.cloudsec.akskwhoami.service.constants;

/**
 * 测试aksk的时候的联网模式
 *
 * @author CC11001100
 */
public enum NetworkMode {

    /**
     * 允许联网测试，会尝试连接云服务商来校验认证是否有效
     */
    ONLINE,

    /**
     * 不需要联网测试，一般仅仅只是基于字符串特征来匹配
     */
    OFFLINE

}
