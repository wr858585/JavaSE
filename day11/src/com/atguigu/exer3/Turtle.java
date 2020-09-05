package com.atguigu.exer3;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Turtle implements Runner, Swimming{

    @Override
    public void run(){
        System.out.println("乌龟跑得慢");
    }

    @Override
    public void swim(){
        System.out.println("乌龟会游泳");
    }

}
