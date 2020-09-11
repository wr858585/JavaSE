package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author oono
 * @date 2020 09 11
 */
public class CollectionTest1 {

    public static void main(String[] args) {

        Collection list = new ArrayList();

        list.add(new Student("tom",12));
        list.add(new Student("jack",13));
        list.add(new Student("marry",15));

        Object[] students = list.toArray();
        for (Object e : students){
            System.out.println(e);
        }
        /*
        com.atguigu.java.Student{name='tom', age=12}
        com.atguigu.java.Student{name='jack', age=13}
        com.atguigu.java.Student{name='marry', age=15}
         */

        for (int i = 0; i < students.length; i++) {
            System.out.println(students);
        }
        /*
        [Ljava.lang.Object;@1540e19d
        [Ljava.lang.Object;@1540e19d
        [Ljava.lang.Object;@1540e19d
         */
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        /*
        com.atguigu.java.Student{name='tom', age=12}
        com.atguigu.java.Student{name='jack', age=13}
        com.atguigu.java.Student{name='marry', age=15}
         */


    }

}

class Student{
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.atguigu.java.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}