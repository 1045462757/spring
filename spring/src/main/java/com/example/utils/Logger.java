package com.example.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 用于记录日志的工具类
 */
@Component("logger")
@Aspect
public class Logger {

    @Pointcut("execution(* com.example.service.impl.*.*(..))")
    private void pt1() {
    }

//    /**
//     * 前置通知
//     */
//    @Before("pt1()")
//    public void beforeLog() {
//        System.out.println("前置通知打印了日志");
//    }
//
//    /**
//     * 后置通知
//     */
//    @AfterReturning("pt1()")
//    public void afterReturningLog() {
//        System.out.println("后置通知打印了日志");
//    }
//
//    /**
//     * 异常通知
//     */
//    @AfterThrowing("pt1()")
//    public void afterThrowingLog() {
//        System.out.println("异常通知打印了日志");
//    }
//
//    /**
//     * 结束通知
//     */
//    @After("pt1()")
//    public void afterLog() {
//        System.out.println("结束通知打印了日志");
//    }

    /**
     * 环绕通知
     */
    @Around("pt1()")
    public Object aroundLog(ProceedingJoinPoint proceedingJoinPoint) {
        Object rtValue;
        try {
            //得到方法执行所需的参数
            Object[] args = proceedingJoinPoint.getArgs();

            System.out.println(new Date() + ",业务方法开始执行");

            rtValue = proceedingJoinPoint.proceed(args);

            System.out.println(new Date() + ",业务方法执行完毕");

            return rtValue;
        } catch (Throwable throwable) {
            System.out.println(new Date() + ",业务方法出现异常");
            throw new RuntimeException(throwable);
        } finally {
            System.out.println(new Date() + ",结束");
        }
    }
}
