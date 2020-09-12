package com.atguigu.exer;

import com.atguigu.java.LinkedListMakingQueue;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author oono
 * @date 2020 09 12
 */
public class Exer2 {

    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("大理寺",12));
        students.add(new Student("小理寺",10));
        students.add(new Student("中理寺",11));

        Iterator<Student> it = students.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }


}

class Student{

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}