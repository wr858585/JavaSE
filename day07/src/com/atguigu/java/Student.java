package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 31
 */
public class Student {

    String name;
    int age;

    public void study() {
        System.out.println("学习");
    }

    public static void show(){
        System.out.println("show...");
        //调用，推荐使用Student.show();当然，对象也可以调用（不是很推荐）
    }
}

