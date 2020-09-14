package com.atguigu.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author oono
 * @date 2020 09 12
 */
public class Question8 {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("liusan",20,90));
        list.add(new Student("lisi",22,90));
        list.add(new Student("wangwu",20,99));
        list.add(new Student("sunliu",22,100));

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getScore() != o2.getScore()) {
                    return -Double.compare(o1.getScore(), o2.getScore());
                }else{
                    return Integer.compare(o1.getAge(),o2.getAge());
                }
            }
        });

        for (Student student : list) {
            System.out.println(student);
        }

    }

}

class Student implements Comparable<Student>{

    private String name;
    private int age;
    private double score;

    @Override
    public int compareTo(Student s2){
        if(this.score != s2.score){
            return Double.compare(this.score,s2.score);
        }else{
            return Integer.compare(this.age, s2.age);
        }
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}