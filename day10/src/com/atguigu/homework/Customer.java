package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 09 04
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account savingsAccount;
    private Account checkingAccount;

    public Customer(String f, String l){
        firstName = f;
        lastName = l;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public Account getAccount(int accountNumber){
        switch(accountNumber){
            case 0:
                return savingsAccount;
            case 1:
                return checkingAccount;
            default:
                System.out.println("请输入正确的账户（0：储蓄账户；1：交易账户）");
                return null;
        }
    }
    public void setAccount(Account acct, int accountNumber){
        switch(accountNumber){
            case 0:
                savingsAccount = acct;
                break;
            case 1:
                checkingAccount = acct;
                break;
            default:
                System.out.println("请输入正确的账户（0：储蓄账户；1：交易账户）");
        }

    }
}
