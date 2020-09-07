package com.atguigu.java2;

import org.junit.Test;

/**
 * @author oono
 * @date 2020 09 07
 */
public class Demo3 {
    @Test
    public void test1(){
        
    }

    String name;
    int age;

    public Demo3() {
    }

    public Demo3(String name) {
        this.name = name;
    }
    
    public void getName() {
        System.out.println("name = " + name);
    }

}
