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
        Account myAccount = new Account();
        theAccountDAO.addAccount(myAccount, true);
        theAccountDAO.doWork();

        //call the accountDao getter/setter methods
        theAccountDAO.setName("foobar");
        theAccountDAO.setSerciveCode("silver");

        String name = theAccountDAO.getName();
        String code = theAccountDAO.getSerciveCode();

        theMembershipDAO.addAccount();
        theMembershipDAO.goToSleep();


        // close the context
        context.close();
    }
}
