package com.marfall.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //this is where we add all of our related advices for logging

    //let's start with an @Before advice


   // @Before("execution(public void com.marfall.springaop.dao.AccountDAO.addAccount())")
    //@Before("execution(public void  add*())")  //any class , any method starts with "add"
    @Before("execution(* add*(com.marfall.springaop.Account, ..))")    //fqcn as parameter
    public void beforeAddAccountAdvice() {

        System.out.println("\n=====>>> Executing @Before advice on method ");

    }
}
