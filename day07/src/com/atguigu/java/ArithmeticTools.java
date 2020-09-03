package com.atguigu.java;

/**
 * 定义一个算数工具类：提供加减乘除等方法
 * @author oono
 * @date 2020 08 31
 */
public class ArithmeticTools {

    public static int sum(int a, int b){
        return a + b;
    }

    public static int minus(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static double div(int a, int b){
        return (double) a / b;
    }

    public static boolean equals(int a, int b){
        return a == b;
    }

    public static boolean isPrime(int num){

        boolean flag = true;

        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                flag = false;
                break;
            }
        }

        return flag;

    }

    public static boolean isPrime1(int num){
        //活用return来结束/跳出方法。
        //break是跳出当前loop，return是跳出当前mtd

        if(num == 1|| num == 2){
            return true;//会结束方法
        }

        for (int i = 3; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;//会结束方法
            }
        }

        return true;//会结束方法

    }

    public static void getNums(int a) {

        for (int i = 1; i <= a ; i++) {
            if(a % i == 0){
                System.out.print(i + "\t");
            }
        }

    }
}
