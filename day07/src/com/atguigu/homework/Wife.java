package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 31
 */
public class Wife {

    String name;
    int age;
    Husband husband;

    public Wife(){

    }
    public Wife(String name, int age, Husband husband){
        this.name = name;
        this.age = age;
        this.husband = husband;
    }

    public void getInfo(){
        System.out.println("name=" + name + ",age=" + age + ",husband=" + husband.name);
    }


}
