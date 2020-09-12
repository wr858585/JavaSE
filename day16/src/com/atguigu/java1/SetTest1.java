package com.atguigu.java1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author oono
 * @date 2020 09 12
 */
public class SetTest1 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("hello");
        set.add("tom");
        set.add("java");
        set.add("jack");
        set.add("java");

        System.out.println(set);

    }

}
