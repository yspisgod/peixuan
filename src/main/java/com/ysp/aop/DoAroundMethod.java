package com.ysp.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class DoAroundMethod implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Aop参数==="+ Arrays.toString(methodInvocation.getArguments()));
        Object result = methodInvocation.proceed();
        //test push th  file
        return result;
    }
}
