package com.atguigu.java1;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author oono
 * @date 2020 09 12
 */
public class TreeSetTest1 {

    public static void main(String[] args) {

        Set set = new TreeSet();

        set.add(new Student("tom",29,88));
        set.add(new Student("jack",27,81));
        set.add(new Student("rose",24,98));
        set.add(new Student("tim",17,98));
        set.add(new Student("lynett",17,78));
        set.add(new Student("susan",17,80));

        for (Object o : set) {
            System.out.println(o);
        }//java.lang.ClassCastException: com.atguigu.java1.Student cannot be cast to java.lang.Comparable

        //因为TreeSet在存储数据的时候，就需要知道每个对象的大小关系，否则无法二分法来存储树形数据
        //所以对于任何自定义类，必须重写Comparable的compareTo逻辑或者Comparator的compare逻辑，才能使每个对象都有自己的大小！
        //且，树形结构绝不会存储相同的数据，所以天然适合作Set、Map的底层结构！！

    }

}

class Student implements Comparable<Student>{

    private String name;
    private int age;
    private int score;

    @Override
    public int compareTo(Student s2){
        //先按字母顺序，再按年龄大小
        if(this.name.equals(s2.name)){
            return Integer.compare(this.age,s2.age);
        }else{
            return this.name.compareTo(s2.name);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                score == student.score &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student() {
    }
}