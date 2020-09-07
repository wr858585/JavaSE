package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 07
 */
public class Demo2 {

    public static void main(String[] args) {



    }

}

class Outer1{

    int a = 10;
    public void test(){
        int b = 20;
        //方法中的局部内部类
        class Inner1{
            int c = 30;
            public void show(){
                a = 40;
                c = 60;
//                b = 50;唯独给局部便变量b赋值不行，会报错，是什么常量。。。
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }
    }

}