package com.atguigu.java1;/**
    @author oono
    @date 2020 08 29
*/public class Chinese {

    public static String country = "中国";//类变量 --> 整个class只有一份，所有instances公用

    public String name;//实例变量 --> 每个instance有自己的一份
    int age = 18;
    private char gender;
}

class ChineseTest{
    public static void main(String[] args) {

        Chinese c1 = new Chinese();
        Chinese c2 = new Chinese();

        c1.age = 28;
        System.out.println(c1.age);//28
        System.out.println(c2.age);//18 --> 实例变量（非static的成员变量），每个实例各有一份，互不影响
        //类的所有加载信息都是存储在方法区中，而非堆 --> 包括类变量

        c1.country = "新中国";

        System.out.println(c1.country);//新中国
        System.out.println(c2.country);//新中国 --> 类变量/静态变量，每个class只有一份，所有实例共用

    }
}
