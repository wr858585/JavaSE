package com.atguigu.java;

import java.util.function.Consumer;

/**
 * 函数式接口SAM（Single Abstract Method）
 * 1. 只有一个方法需要被重写的接口
 * @author oono
 * @date 2020 09 21
 */
public class SAMTest {

    public static void main(String[] args) {

        invokeCalc(new Calculator() {
            @Override
            public int clac(int a, int b) {
                return a + b;
            }
        }, 1, 2);

        System.out.println("--Welcome Lambda--");

        invokeCalc((a,b) -> a + b,1,2);//最简单的形式
        invokeCalc((a,b) -> {return a - b;},1,2);
        invokeCalc((a,b) -> {return a * b;},1,2);
        invokeCalc((a,b) -> {return a / b;},1,2);
        invokeCalc((a,b) -> {return a % b;},1,2);

        System.out.println("--Another Example--");

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        System.out.println("--Welcome Lambda Again!--");

        Consumer<String> consumer1 = s -> System.out.println(s);//极简！参数只有一个时，小括号都可以省略（没有参数则不能省略）

    }

    //使用计算器操作整数
    public static void invokeCalc(Calculator calculator, int a, int b){
        System.out.println(calculator.clac(a,b));
    }

}

//可以用@FunctionalInterface来验证是否是SAM
@FunctionalInterface
interface Calculator{

    int clac(int a, int b);

}