package com.ssm.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年03月17日 15:29
 */
public class MyAspect {
    //前置通知
    public void myBefore(JoinPoint joinpoint) {
        System.out.print("前置通知：模拟执行权限检查。。。，");
        System.out.print("目标类是：" +joinpoint.getTarget());
        System.out.println(",被植入增强处理的目标方法为："+joinpoint.getSignature().getName());
    }

    //后置通知
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.print("后置通知：模拟记录日志。。。，");
        System.out.println("被植入增强处理的目标方法为" + joinPoint.getSignature().getName());
    }

    /**
     * 环绕通知
     * ProceedingJoinPoint是JoinPoint的子接口，表示客执行的方法
     * 1。必须是Object类型的返回值
     * 2。必须是接收一个参数，类型为ProceedingJoinPoint
     * 3。必须是throws Throwable
     */
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //开始
        System.out.print("环绕开始：执行目标方法之前，模拟开启事物。。。，");
        //执行当前目标方法
        Object obj = proceedingJoinPoint.proceed();
        //结束
        System.out.println("环绕结束：执行目标方法之后，模拟关闭事物。。。，");
        return obj;
    }

    //异常通知
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("异常通知：出错了" + e.getMessage());
    }

    //最终通知
    public void myAfter() {
        System.out.println("最终通知：模拟方法结束后释放资源。。。");
    }
}
