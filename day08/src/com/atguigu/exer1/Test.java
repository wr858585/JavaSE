package com.atguigu.exer1;

/**
 * @author oono
 * @date 2020 09 01
 */
public class Test {
    public static void main(String[] args) {

        Customer cust = new Customer("Jane","Smith");

        Account acct = new Account(1000,2000,0.0123);

        cust.setAccount(acct);

        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);

        System.out.println(cust.getFirstName() + " " +cust.getLastName() + " has an account with id = " + cust.getAccount().getId()
        + ", balance = " + cust.getAccount().getBalance() + ", annualInterestRate = " + cust.getAccount().getAnnualInterestRate());
    }
}
