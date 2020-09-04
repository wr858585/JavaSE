package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 09 04
 */
public class Account {

    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amt){
        balance += amt;
        System.out.println("成功存款：" + amt + "元");
    }

    public boolean withdraw(double amt){
        if(amt > balance){
            System.out.println("余额不足，取款失败:<");
            return false;
        }else{
            balance -= amt;
            return true;
        }
    }
}
