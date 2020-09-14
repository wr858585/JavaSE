package com.atguigu.java1;

import java.util.HashSet;
import java.util.Set;

/**
 * Set接口实现类的特点：元素唯一，无序存储
 * （ie 不能按照元素的添加顺序进行遍历（显然List可以）；所以TreeSet才有了存在的意义 --> 可以按照元素添加的顺序遍历）
 * @author oono
 * @date 2020 09 12
 */
public class SetTest {

    public static void main(String[] args) {

        //HashSet实例化
        Set<Integer> set = new HashSet<>();

        //添加元素
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(11);

        System.out.println(set);//[33, 22, 11]

    }

}
