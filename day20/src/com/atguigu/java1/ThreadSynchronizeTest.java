package com.atguigu.java1;

/**
 * 火车卖票问题
 * 1. 线程安全问题原因
 * ① 多个线程共同操纵同一共享数据
 * ② 不止一条语句（一个语句的话，执行完了就换其他线程也无所谓，因为已经操作完了；怕就怕还没操作完，其他线程进来操作）
 * 2. solution
 * ① 同步代码块 --> synchronized修饰代码块block
 * ② 同步方法 --> synchronized修饰方法mtd，锁对象默认就是this（但是静态方法的锁默认对象是类名.class）
 * @author oono
 * @date 2020 09 18
 */
public class ThreadSynchronizeTest {

    public static void main(String[] args) {

        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.start();
        w2.start();
        w3.start();


    }

}

class Window extends Thread{

    static int ticket = 100;

    @Override
    public void run(){

        //解决线程安全方式一：同步代码块
        while(true){
            //多个线程的锁对象一定要是同一个，否则锁不住。
            //线程安全了，效率降低
            synchronized (this){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "卖了第" + ticket-- + "张票");
                }
            }
        }

    }
}