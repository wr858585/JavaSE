package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 09 04
 */
public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank(10);

        Object obj = bank;

        bank.addCustomer("Tom","Scarvo");
        Customer cust0 = bank.getCustomer(0);
//        bank.addCustomer("Lynnet","Scarvo");

//        System.out.println(bank.getNumberOfCustomers());

        Account acctChecking0 = new CheckingAccount(1000,2000);
        Account acctCSavings0 = new SavingsAccount(1000,0.1);

        cust0.setAccount(acctChecking0,1);
        cust0.setAccount(acctCSavings0,0);




//        bank.getCustomer(0).setAccount(acctChecking0);
//        bank.getCustomer(0).setAccount(acctCSavings0);
//        bank.getCustomer(1).setAccount(new CheckingAccount(1000,10000));
//        bank.getCustomer(1).setAccount(new SavingsAccount(5000,0.01));

        acctChecking0.deposit(5000);
        acctChecking0.withdraw(6500);
        acctChecking0.withdraw(1000);
        acctChecking0.withdraw(1000);




    }
}
