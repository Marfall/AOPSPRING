package com.marfall.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {



    @Pointcut("execution(* com.marfall.springaop.dao.*.*(..))")
    private void forDaoPackage() {}


   @Before("forDaoPackage()")    //fqcn as parameter
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method ");
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics() {
        System.out.println("\n=====>>> Perform API analytics ");
    }
}
