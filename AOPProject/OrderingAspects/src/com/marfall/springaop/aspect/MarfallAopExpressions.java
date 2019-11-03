package com.marfall.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MarfallAopExpressions {

    @Pointcut("execution(* com.marfall.springaop.dao.*.*(..))")
    public void forDaoPackage() {}


    //create pointcut for getter methods
    @Pointcut("execution(* com.marfall.springaop.dao.*.get*(..))")
    public void getter() {}

    //create pointcut for setter methods
    @Pointcut("execution(* com.marfall.springaop.dao.*.set*(..))")
    public void setter()  {}

    //create pointcut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}
}
