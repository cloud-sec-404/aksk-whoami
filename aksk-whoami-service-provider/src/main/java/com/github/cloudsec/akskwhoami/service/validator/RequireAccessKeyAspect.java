package com.github.cloudsec.akskwhoami.service.validator;

import com.github.cloudsec.akskwhoami.service.constants.Message;
import com.github.cloudsec.akskwhoami.service.result.OfflineTestResult;
import com.github.cloudsec.akskwhoami.service.result.OnlineTestResult;
import com.github.cloudsec.akskwhoami.service.task.TestTask;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * 某些情况下是必须传递ak或者sk，这个切面就是用于这种检查
 *
 * @author CC11001100
 */
@Aspect
public class RequireAccessKeyAspect {

    @Pointcut("@annotation(com.github.cloudsec.akskwhoami.service.validator.TestTaskAkSkValidator)")
    public void checkParamPointcut() {
    }

    /**
     * @param joinPoint
     */
    @Around("checkParamPointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object validate = this.validate(joinPoint);
        if (validate != null) {
            return validate;
        } else {
            return joinPoint.proceed();
        }
    }

    /**
     * 参数校验
     *
     * @param joinPoint
     * @return 如果有值返回，说明校验没有通过，使用返回值替换方法的返回值，方法不需要再执行
     */
    private Object validate(ProceedingJoinPoint joinPoint) {

        TestTask task = this.getTestTask(joinPoint);
        if (task == null) {
            return null;
        }

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        TestTaskAkSkValidator annotation = methodSignature.getMethod().getAnnotation(TestTaskAkSkValidator.class);
        if (annotation == null) {
            return null;
        }

        Class returnType = methodSignature.getReturnType();
        if (returnType == null) {
            return null;
        }

        if (OnlineTestResult.class == returnType) {
            return this.validateForOnlineTestTask(joinPoint, annotation, task);
        } else if (OfflineTestResult.class == returnType) {
            return this.validateForOfflineTestTask(joinPoint, annotation, task);
        } else {
            return null;
        }
    }

    /**
     * @param joinPoint
     * @param annotation
     * @param task
     * @return
     */
    private OnlineTestResult validateForOnlineTestTask(ProceedingJoinPoint joinPoint, TestTaskAkSkValidator annotation, TestTask task) {

        if (annotation.requireAccessKey() && StringUtils.isBlank(task.getAccessKey())) {
            return OnlineTestResult.failedWithDescription(Message.AK_NULL);
        }

        if (annotation.requireSecretKey() && StringUtils.isBlank(task.getSecretKey())) {
            return OnlineTestResult.failedWithDescription(Message.SK_NULL);
        }

        return null;
    }

    /**
     * @param joinPoint
     * @param annotation
     * @param task
     * @return
     */
    private OfflineTestResult validateForOfflineTestTask(ProceedingJoinPoint joinPoint, TestTaskAkSkValidator annotation, TestTask task) {

        if (annotation.requireAccessKey() && StringUtils.isBlank(task.getAccessKey())) {
            return OfflineTestResult.failed().setDescription(Message.AK_NULL);
        }

        if (annotation.requireSecretKey() && StringUtils.isBlank(task.getSecretKey())) {
            return OfflineTestResult.failed().setDescription(Message.SK_NULL);
        }

        return null;
    }

    /**
     * @param joinPoint
     * @return
     */
    private TestTask getTestTask(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        if (args == null) {
            return null;
        }
        for (Object arg : args) {
            if (arg instanceof TestTask) {
                return (TestTask) arg;
            }
        }
        return null;
    }

}
