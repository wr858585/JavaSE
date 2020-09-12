package com.atguigu.exer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author oono
 * @date 2020 09 12
 */
public class Exer1 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Person> list3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list1.add((new Random().nextInt()));
            list2.add("路人" + (char)(new Random().nextInt()));
            list3.add(new Person("路人" + (char)(new Random().nextInt()),(new Random().nextInt(100))));
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list1.get(i) + "\t");
        }
        System.out.println();

        Iterator it = list2.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + "\t");
        }
        System.out.println();

        for (Person person : list3) {
            System.out.print(person + "\t");
        }
    }


}

class Person{

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}