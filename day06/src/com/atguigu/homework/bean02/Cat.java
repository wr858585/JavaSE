package com.atguigu.homework.bean02;

/**
 * @author oono
 * @date 2020 08 31
 */
public class Cat {

    static String name;
    static int age;

    public void show(){
        System.out.println(name + ", " + age);
    }

    //static方法只能访问到类变量，因为类变量也是在类加载时加载的（和静态方法一样），在方法区中
    public static void showInfo(){
        System.out.println(name + ", " + age);
    }


}
