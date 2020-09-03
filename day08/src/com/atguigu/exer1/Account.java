package com.atguigu.exer1;

/**
 * @author oono
 * @date 2020 09 01
 */
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("余额不足，取款失败");
        }else{
            balance -= amount;
            System.out.println("成功取款" + amount + "元\t余额：" + balance);
        }
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("成功存款" + amount + "元\t余额：" + balance);
    }
}
