package com.atguigu.java;

/**
 * String类
 * 1. 引用数类
 * 2. String是一个不可变的字符序列：一旦创建，长度和内容都不可改
 * ① private final char value[];
 *      表示私有属性不可直接操作，final修饰表示这个变量不能重新赋值（这里为数组，所以是地址值，不能创建一个新的对象给这个引用去更改值）
 *      String类中也没有对外提供相关方法可以操作该value数组，所以字符串不可变
 * ② 字符串常量存在于常量池中，内存中只有一份
 *
 *
 * 3.
 * @author oono
 * @date 2020 09 08
 */
public class Demo {

    public static void main(String[] args) {

        String s = "abc";//字符串常量，又叫字面量，也可以看成字符串对象一个String类的实例





    }

}
