package com.atguigu.homework;

import java.sql.SQLOutput;

/**
 * @author oono
 * @date 2020 09 04
 */
public class CheckingAccount extends Account{

    private double overdraftProtection;

    public CheckingAccount(double balance){
        super(balance);
    }
    public CheckingAccount(double balance, double protect){
        super(balance);
        overdraftProtection = protect;
    }

    @Override
    public boolean withdraw(double amt){
        if(amt > getBalance() + overdraftProtection){
            System.out.println("超过透支额度，取款失败");
            return false;
        }else if(amt >= getBalance()){
            overdraftProtection -= amt - getBalance();
            super.withdraw(getBalance());
            System.out.println("取款成功，存款余额为0，透支额度还剩：" + (overdraftProtection) + "元");
            return true;
        }else{
            super.withdraw(amt);
            System.out.println("取款成功，存款余额为" + (getBalance() - amt) + "元，透支额度还剩" + overdraftProtection + "元");
            return true;
        }
    }
}
