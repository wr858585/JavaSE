package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author oono
 * @date 2020 09 11
 */
public class ForeachTest {

    public static void main(String[] args) {

        Collection list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("JAVA");

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list[i]);
//        }
        //普通for循环无法遍历集合，只能遍历数组，所以需要list.toArray()转成数组才能遍历

        //增强for可以直接遍历集合，因为底层就是迭代器（也可以遍历数组）
        for (Object s : list) {
            System.out.println(s);
        }

    }

}
