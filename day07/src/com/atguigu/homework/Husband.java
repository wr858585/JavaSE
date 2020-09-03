package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 31
 */
public class Husband {

    String name;
    int age;
    Wife wife;

    public Husband(){

    }
    public Husband(String name, int age, Wife wife){
        this.name = name;
        this.age = age;
        this.wife = wife;
    }

    public void getInfo(){
        System.out.println("name=" + name + ",age=" + age + ",wife=" + wife.name);
    }

}
