package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 18
 */
public class ThreadTest3 {
    public static void main(String[] args) {

        //匿名创建Thread类的对象
        new Thread("线程1："){
            @Override
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }.start();

        //匿名创建Thread类的对象，匿名实现Runnable接口
        new Thread(new Runnable(){
            @Override
            public void run(){
//                Thread.currentThread().setName("线程2：");
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        },"线程2：").start();

    }

}
