package com.atguigu.java2;

/**
 * JavaBean:
 * 1. public类
 * 2. 有空参构造器
 * 3. 有getter，setter
 * @author oono
 * @date 2020 09 19
 */
public class People {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People() {
    }
}
