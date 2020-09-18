package com.atguigu.java;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author oono
 * @date 2020 09 18
 */
public class ThreadTest2 {

    public static void main(String[] args) {

        Teller teller = new Teller();

        Thread thd1 = new Thread(teller);
        Thread thd2 = new Thread(teller);
        Thread thd3 = new Thread(teller);

        thd1.setName("窗口A ");
        thd2.setName("窗口B ");
        thd3.setName("窗口C ");

        thd1.start();
        thd2.start();
        thd3.start();

    }

}

class Teller implements Runnable{

    private int ticket = 100;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run(){

        while(true) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "has sold a ticket：" + ticket-- + ". Remaining Tickets：" + ticket);
                }else{
                    break;
                }
            }
        }

//        while(true){
//            try{
//                lock.lock();
//                if(ticket > 0){
//                    System.out.println(Thread.currentThread().getName() + "has hold a ticket：" + ticket-- + ". Remaining Tickets：" + ticket);
//                }else{
//                    break;
//                }
//            }finally{
//                lock.unlock();
//            }
//        }
    }
}