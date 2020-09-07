package com.atguigu.java;

/**
 * 静态内部类：用static修饰的成员内部类
 * 四种权限修饰符都可以修饰静态内部类；而public，缺省才能修饰外部类
 * @author oono
 * @date 2020 09 07
 */
public class Demo {

    public static void main(String[] args) {

        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        System.out.println(inner.b);

    }
}

class OuterClass{

    int a = 10;
    static int c = 30;
    public void test(){

    }

    static class InnerClass{
        int b = 20;
        public void show(){
//            System.out.println(a);静态结构不能访问非静态结构
            System.out.println(new OuterClass().a);
            System.out.println(c);
        }
    }

}

