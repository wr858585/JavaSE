package com.atguigu.java1;

/**
 * join()方法
 * 1. 在线程A中，如果有线程B调用了join()方法，即b.join()，则A需要等到B执行完了之后，线程B isAlive == false后，A才能继续执行
 * 2. 相当于b.join()后，A进入阻塞，B线程死亡后，A才结束阻塞
 * 3. b.join(long millis)，则A只会阻塞millis时间，之后A结束阻塞！
 * @author oono
 * @date 2020 09 18
 */
public class ThreadMethodTest1 {

    public static void main(String[] args) throws InterruptedException {

        Thread2 thread2 = new Thread2();
        Thread thd = new Thread(thread2);

        thd.start();

        //由于分线程在睡觉，所以一定是主线程执行，i的值没有机会被更改就已经输出了
        //如果想要分线程把这个i的值改成10，再让主线程来打印，则需要先让主线程阻塞，直到分线程执行完毕，才结束阻塞-->join

        thd.join();

        int i = thread2.i;

        System.out.println(i);
    }
}

class Thread2 implements Runnable{

    int i = 1;

    @Override
    public void run(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        i = 10;
    }

}