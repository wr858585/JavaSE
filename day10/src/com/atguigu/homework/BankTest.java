package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 09 04
 */
public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank(10);

        bank.addCustomer("Tom","Scarvo");
        bank.addCustomer("Lynnet","Scarvo");

        System.out.println(bank.getNumberOfCustomers());

        Account acctChecking0 = new CheckingAccount(1000,2000);

        bank.getCustomer(0).setAccount(new CheckingAccount(1000,2000));
        bank.getCustomer(0).setAccount(new SavingsAccount(2000,0.01));
        bank.getCustomer(1).setAccount(new CheckingAccount(1000,10000));
        bank.getCustomer(1).setAccount(new SavingsAccount(5000,0.01));

        acctChecking0.deposit(5000);
        acctChecking0.withdraw(6500);
        acctChecking0.withdraw(1000);
        acctChecking0.withdraw(1000);




    }
}
