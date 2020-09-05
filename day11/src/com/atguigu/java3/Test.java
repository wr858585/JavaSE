package com.atguigu.java3;

/**
 * @author oono
 * @date 2020 09 05
 */
public class Test {
    public static void main(String[] args) {

        Student s1 = new Student("大理石",22,89);
        Student s2 = new Student("花岗岩",22,79);

        int i = s1.compareTo(s2);
        System.out.println(i);//-1
    }
}
