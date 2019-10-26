package com.marfall.springaop;

import com.marfall.springaop.dao.AccountDAO;
import com.marfall.springaop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {


        // read spring-config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // get the bean from spring container"accountDAO",
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        //get membership bean from spring container
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        // call the business method
        theAccountDAO.addAccount();
        theMembershipDAO.addAccount();


        // close the context
        context.close();
    }
}
