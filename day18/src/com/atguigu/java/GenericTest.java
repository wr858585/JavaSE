package com.atguigu.java;

/**
 * 泛型
 * 1. 定义：泛型是参数化类型，不是一个类；且只能是引用数类
 * 2. 好处：把运行期的可能类型转换异常，在编译器就暴露出来；先就规定好能传入的数类，之后不用再强制转换
 * 3. 格式：
 * ① 使用时，明确指明数类，如：<String>
 *
 * @author oono
 * @date 2020 09 14
 */
public class GenericTest {

    public static void main(String[] args) {

        Student<Double> student = new Student<>();
        student.setName("小强");
        student.setScore(99.0);

        Student<Integer> student1 = new Student<>();
        student1.setName("小明");
        student1.setScore(99);

    }
}

class Student<T>{

    private String name;
    private T score;

    public String getName() {
        return name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }
}