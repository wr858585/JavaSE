package com.atguigu.exer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author oono
 * @date 2020 09 11
 */
public class Exercise3 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            students.add(new Student("学生" + (i + 1), new Random().nextInt(100)));
        }


        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("--------------------");

        Iterator iterator = students.iterator();
        while(iterator.hasNext()){
            Student stu = (Student)iterator.next();
            if(stu.getScore() < 60){
                iterator.remove();
            }
        }
        System.out.println(students);



    }


}

class Student{

    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}