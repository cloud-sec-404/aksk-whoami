package com.github.cloudsec.akskwhoami.service.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于方法注解上，检查是否传入了要求的aksk，当未通过检查时则不会再调用方法而是直接返回错误信息
 *
 * @author CC11001100
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestTaskAkSkValidator {

    /**
     * 表示方法的 {@link com.github.cloudsec.akskwhoami.service.task.TestTask} 参数必须设置 ak
     *
     * @return
     */
    boolean requireAccessKey() default true;

    /**
     * 表示方法的 {@link com.github.cloudsec.akskwhoami.service.task.TestTask} 参数必须设置 sk
     *
     * @return
     */
    boolean requireSecretKey() default true;

}
