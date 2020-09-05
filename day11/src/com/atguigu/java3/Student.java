package com.atguigu.java3;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Student implements Comparable{

    private String name;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student s = (Student)o;
            return Integer.compare(this.score,s.score);
        }
        throw new RuntimeException("数据类型不一致");
    }
}
