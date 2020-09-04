package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 09 04
 */
public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
