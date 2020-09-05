package com.atguigu.singleton;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Hungry {

    public static void main(String[] args) {

        //private构造器所以不能再在外部实例化了
//        Bank bank = new Bank();

        //只能通过类.getInstance()来获取类内部造好的一个唯一实例
        Bank instance = Bank.getInstance();

    }

}

class Bank{

    private Bank(){

    }

    private static Bank instance = new Bank();

    public static Bank getInstance(){
        return instance;
    }

}
