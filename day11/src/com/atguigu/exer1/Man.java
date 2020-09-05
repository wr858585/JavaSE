package com.atguigu.exer1;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Man extends Person{

    @Override
    public void walk(){
        System.out.println("男人走路");
    }

    @Override
    public void eat(){
        System.out.println("男人吃饭");
    }

    public void smoke(){
        System.out.println("男人抽烟");
    }
}
