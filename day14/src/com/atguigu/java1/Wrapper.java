package com.atguigu.java1;

/**
 * 包装类
 * 1.
 * @author oono
 * @date 2020 09 09
 */
public class Wrapper {

    public static void main(String[] args) {

        int a = 10;
        Integer i = a;//自动装箱（自动：基本数类-->包装类）

        int b = i;//自动拆箱（自动：包装类-->基本数类）

        //包装类的常用方法

        int compare = Integer.compare(10, 20);
        System.out.println("compare = " + compare);//-1 --> 左边比右边的做差小于0，结果为负数，记为-1。（-1表示o1比o2小，1表示o1比o2大）

        int parse = Integer.parseInt("123");
        System.out.println("parse = " + parse);//123
        Integer integer = Integer.valueOf("123");
        System.out.println("parse = " + integer);//123

        String s = Integer.toString(123);
        System.out.println("s = " + s);//123
        String s1 = String.valueOf(123);
        System.out.println("s1 = " + s1);//123

        //可以发现，所以的包装类和String都有一个公共的方法valueOf()，均可以将不同格式的数据的值转化为调用方法的所在类的数据！


    }


}
