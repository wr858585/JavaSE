package com.atguigu.java;

/**
 * 创建多线程方式一：继承Thread类
 * @author oono
 * @date 2020 09 18
 */
public class ThreadTest {

    public static void main(String[] args) {

        SubClass sub1 = new SubClass();
        sub1.start();

        SubClass sub2 = new SubClass();
        sub2.start();

//        Thread.currentThread().setName("线程1");
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "执行了");
        }

    }
}

//线程类
class SubClass extends Thread{
    //线程任务
    @Override
    public void run(){
//        Thread.currentThread().setName("线程2");
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "执行了");
        }
    }

}