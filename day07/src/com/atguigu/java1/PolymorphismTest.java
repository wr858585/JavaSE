package com.atguigu.java1;

import java.util.Random;

/**
 * @author oono
 * @date 2020 08 31
 */
public class PolymorphismTest {

    public static void main(String[] args) {

        //随机生成一个[1,3]之间的整数
        int choice = (int) (Math.random() * (3 - 1 + 1) + 1);
        System.out.println(choice);

        Animal animal = getInstance(choice);

        animal.eat();//运行时行为

    }

    public static Animal getInstance(int choice) {
        switch (choice) {
            case 1:
                return new Dog();
            case 2:
                return new Cat();
            default:
                return new Bird();
        }
    }
}


class Animal{
    public void eat(){
        System.out.println("Animals love food.");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Dogs love bones.");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("Cats love fish.");
    }
}
class Bird extends Animal{
    public void eat(){
        System.out.println("Birds love grass.");
    }
}