package com.atguigu.java2;

/**
 * @author oono
 * @date 2020 09 07
 */
public class Test {


    public static void main(String[] args) {

        Sub sub = new Sub();
//        Sub sub = new Sub("男","大理石");

        System.out.println(sub.gender);
        System.out.println(sub.name);

    }

}

class Super{
    String name;
    int age;
    String gender;

    public Super() {
    }

    public Super(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Super(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}

class Sub extends Super{

    public Sub() {
    }

    public Sub(String gender, String name){
        super(gender, name);
    }
}