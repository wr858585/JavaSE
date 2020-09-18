package com.atguigu.java1;

/**
 * sleep()方法
 * 1. Thread类中的静态方法，让线程进入阻塞一段时间
 * 2. 不会释放锁
 * @author oono
 * @date 2020 09 18
 */
public class ThreadMethodTest {

    public static void main(String[] args) {

        /*
        sleep(long millis)：
        1. 不会解锁
        2. Thread.sleep()，静态方法
         */

        Thread1 thread1 = new Thread1();
        Thread thd1 = new Thread(thread1,"线程1:");
        Thread thd2 = new Thread(thread1,"线程2:");

        thd1.start();
        thd2.start();

    }

}

class Thread1 implements Runnable{

    @Override
    public void run(){
        for (int i = 1; i <= 20; i++) {
            if(i == 10){
                System.out.println("等待3秒");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + i);
        }
    }

}