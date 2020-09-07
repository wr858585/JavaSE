package com.atguigu.java;

/**
 * @author oono
 * @date 2020 09 07
 */
public class Demo3 {

    public static void main(String[] args) {

        new Person().invite(new Danceable() {
            @Override
            public void dance() {
                System.out.println("调街舞");
            }
        });

    }

}

interface Danceable{
    void dance();
}

class Person{
    public void invite(Danceable danceable){
        danceable.dance();
    }
}