package com.atguigu.exer1;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Woman extends Person{

    @Override
    public void walk(){
        System.out.println("女人走路");
    }

    @Override
    public void eat(){
        System.out.println("女人吃饭");
    }

    public void shop(){
        System.out.println("买买买");
    }

}
