package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 07
 */
public class Demo1 {

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

    }
}

class Outer{

    private int a = 10;
    static int c = 30;
    public void test(){

    }

    //非静态内部类 -> 可以访问外部类的所有结构（因为非静态可以访问静态结构，且private结构是在类内部可以调用，这里是类内部也可以）（
    class Inner{

        int b = 20;
        public void show(){

        }

        //非静态结构，不能再定义静态结构
        /*public static test1(){

        }*/

        //但是可以定义全局常量
        static final int d = 0;

    }

}
