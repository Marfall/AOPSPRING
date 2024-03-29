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


    //create pointcut for getter methods
    @Pointcut("execution(* com.marfall.springaop.dao.*.get*(..))")
    private void getter() {}

    //create pointcut for setter methods
    @Pointcut("execution(* com.marfall.springaop.dao.*.set*(..))")
    private void setter()  {}

    //create pointcut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter() {}


   @Before("forDaoPackageNoGetterSetter()")    //fqcn as parameter
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method ");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics() {
        System.out.println("\n=====>>> Perform API analytics ");
    }
}
