package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 31
 */
public class FamilyTest {

    public static void main(String[] args) {

        Husband hus = new Husband();
        Wife wife = new Wife();

        hus.name = "xiaoming";
        hus.age = 19;
        hus.wife = wife;
        wife.name = "xia1ng";
        wife.age = 20;
        wife.husband = hus;


        hus.getInfo();
        wife.getInfo();
    }





}
