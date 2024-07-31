package com.github.cloudsec.akskwhoami.utils;

import java.util.UUID;

/**
 * @author CC11001100
 */
public class IdUtil {

    /**
     * @return
     */
    public static String randomId() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
