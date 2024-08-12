package com.github.cloudsec.akskwhoami.service.constants;

/**
 *
 * 表示aksk的认证类型，不同的服务商可能会有自己的认证类型
 *
 * @author CC11001100
 */
public class AuthType {

    /**
     * 是通过aksk的方式认证的
     */
    public static final String AKSK = "aksk";

    /**
     * 是通过http basic认证方式
     */
    public static final String BEARER = "bearer";

    /**
     * token的方式认证
     */
    public static final String TOKEN = "token";

    /**
     * 公钥、私钥方式
     */
    public static final String PUBLIC_PRIVATE_KEY = "public/private key";

}
