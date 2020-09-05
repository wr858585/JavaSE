package com.atguigu.exer2;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Animal implements Liveable{

    @Override
    public void eat(){
        System.out.println("动物能吃东西");
    }

    @Override
    public void breath(){
        System.out.println("动物能呼吸");
    }

    @Override
    public void sleep(){
        System.out.println("动物能闭上眼睛睡觉");
    }

    //drink()方法为静态方法，不能被重写

}
