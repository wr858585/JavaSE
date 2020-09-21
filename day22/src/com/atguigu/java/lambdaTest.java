package com.atguigu.java;

import java.util.Comparator;

/**
 * lambda表达式：实质是一个匿名内部类的obj
 * 1. 一般，lambda表达式是要实现一个匿名接口，且重写方法唯一的语法糖
 * 2. 以上所述的接口 --> 可以叫函数式接口SAM(Single Abstract Method)
 * @author oono
 * @date 2020 09 21
 */
public class lambdaTest {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Welcome lambda");
            }
        }).start();

        System.out.println("---------");

        //lambda表达式代替匿名内部类：因为匿名内部类里面需要的结构是什么，是清楚的，所以用某格式省略，只写方法体
        //intuition：简单的函数，且用链式编程思想，一直点出来对象，则一直可以调方法，最后出结果
        //语法糖

        new Thread(() -> System.out.println("Welcome lambda again!")).start();

    }

}
