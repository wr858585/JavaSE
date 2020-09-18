package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 18
 */
public class ThreadTest1 {

    public static void main(String[] args) {

        Sub sub = new Sub();
        Thread thd = new Thread(sub);
        Thread thd1 = new Thread(sub);

        thd.start();
        thd1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }

    }


}

class Sub implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }

}