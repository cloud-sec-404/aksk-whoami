package com.github.cloudsec.akskwhoami.utils;

import java.util.UUID;

/**
 * @author CC11001100
 */
public class IDUtil {

    /**
     * 生成一个32位字符串的随机id（不带横线的hash）
     *
     * @return
     */
    public static String randomId() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
