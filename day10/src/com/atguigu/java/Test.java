package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 04
 */
public class Test {

    public static void main(String[] args) {

        Person p = new Person();
        Dog d = new Dog();
        Cat c = new Cat();

        p.feed(d);
        p.feed(c);


    }

}
