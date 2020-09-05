package com.atguigu.exer2;

/**
 * @author oono
 * @date 2020 09 05
 */
public interface Liveable {

    //abstract mtd
    void eat();
    void breath();

    //default mtd
    default void sleep(){
        System.out.println("静止不动");
    }

    //static mtd
    static void drink(){
        System.out.println("喝水");
    }
}
