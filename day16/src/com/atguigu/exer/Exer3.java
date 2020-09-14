package com.atguigu.exer;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author oono
 * @date 2020 09 12
 */
public class Exer3 {

    public static void main(String[] args) {

        LinkedList<Cat> cats = new LinkedList<>();

        cats.addFirst(new Cat("小花花",1));
        cats.addLast(new Cat("小牛牛",2));
        cats.addFirst(new Cat("小皮皮",3));

        ListIterator<Cat> it = cats.listIterator(cats.size());
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }

        cats.removeLast();

        System.out.println(cats);


    }

}

class Cat{

    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}