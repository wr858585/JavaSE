package com.atguigu.java1;

/**
 * 生产者-消费者问题：Producer-Consumer Problem
 * @author oono
 * @date 2020 09 18
 */
public class ProducerConsumerProblemTest {

    public static void main(String[] args) {

        Workbench workbench = new Workbench();
        Waiter waiter =  new Waiter(workbench);
        Chef chef = new Chef(workbench);

        Thread thd1 = new Thread(waiter,"服务员");
        Thread thd2 = new Thread(waiter,"厨师");

        thd1.start();
        thd2.start();

    }

}

class Waiter implements Runnable{

    private Workbench workbench;

    public Waiter(Workbench workbench){
        this.workbench = workbench;
    }

    @Override
    public void run(){

        while(true){
            if(workbench.num > 0){
                workbench.num--;
                System.out.println(Thread.currentThread().getName() + "取走一份，剩余：" + workbench.num + "份食物");
            }
        }
    }
}

class Chef implements Runnable{

    private Workbench workbench;

    public Chef(Workbench workbench){
        this.workbench = workbench;
    }

    @Override
    public void run(){

        //厨师线程任务：生产食物
        while(true){
            if(workbench.num < workbench.MAX_VALUE){
                workbench.num ++;
                System.out.println(Thread.currentThread().getName() + "生产了一份，剩余：" + workbench.num + "份食物");
            }
        }
    }
}

class Workbench{

    public static final int MAX_VALUE = 10;
    int num = 0;//工作台上剩余的食物数量

}

