package com.atguigu.singleton;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Lazy {

    public static void main(String[] args) {

        Bank1 instance1 = Bank1.getInstance1();

    }

}

class Bank1{

    private Bank1(){

    }

    private static Bank1 instance1 = null;

    //这种同步造成效率太低，需要优化！
    public static synchronized Bank1 getInstance1(){
        if(instance1 == null){
            instance1 = new Bank1();
        }
        return instance1;
    }

}
