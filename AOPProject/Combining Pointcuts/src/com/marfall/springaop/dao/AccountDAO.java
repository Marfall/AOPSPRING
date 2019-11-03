package com.marfall.springaop.dao;

import com.marfall.springaop.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private String serciveCode;

    public void addAccount(Account theAccount, boolean vipFlag){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    public boolean doWork() {
        System.out.println(getClass() + " : doWork()");

        return false;
    }


    public String getName() {
        System.out.println(getClass() + " :in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + " : in setName()");
        this.name = name;
    }

    public String getSerciveCode() {
        System.out.println(getClass() + " : in getServiceCode()");
        return serciveCode;
    }

    public void setSerciveCode(String serciveCode) {
        System.out.println(getClass() + " : in setServiceCode()");
        this.serciveCode = serciveCode;
    }
}
