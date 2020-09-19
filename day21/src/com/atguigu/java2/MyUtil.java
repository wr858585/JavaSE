package com.atguigu.java2;

/**
 * 练习：写一个工具，给出一个类型，就可以用它返回该类型的一个实例
 * @author oono
 * @date 2020 09 19
 */
public class MyUtil {

    public static void main(String[] args) throws Exception{

        String str = "com.atguigu.java2.People";

        Class aClass = Class.forName(str);

        Object obj = aClass.newInstance();

        System.out.println(obj);

    }


}
