package com.atguigu.java1;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author oono
 * @date 2020 09 12
 */
public class TreeSetTest {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        set.add(33);
        set.add(34);
        set.add(2);
        set.add(15);
        set.add(9);
        set.add(9);
        set.add(20);
        set.add(27);
        set.add(50);

        System.out.println(set);//会自动排序！！
        //所以暗含一个要求：元素必须要能比较 --> 如果是自定义类，必须重写compareTo()或者compare()方法

        Set<String> set1 = new TreeSet<>();

        set1.add("hello");
        set1.add("world");
        set1.add("java");
        set1.add("python");
        set1.add("c");

        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<>();

        set.add(43);
        set.add(41);
        set.add(3);
        set.add(53);
        set.add(13);

        System.out.println(set2);



    }

}
