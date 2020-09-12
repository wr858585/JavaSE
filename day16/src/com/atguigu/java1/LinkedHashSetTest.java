package com.atguigu.java1;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author oono
 * @date 2020 09 12
 */
public class LinkedHashSetTest {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("hello");
        set.add("world");
        set.add("JAVA");
        set.add("hello");
        set.add("html");

        System.out.println(set);//[hello, world, JAVA, html]



    }

}
