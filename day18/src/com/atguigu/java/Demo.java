package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符
 * 1. <?>：表示泛型是任何类
 * 2. <? extends A>：表示泛型是任何<=A的子类（包括A）
 * 3. <? super A>：表示泛型是任何>=A的父类（包括A）
 * @author oono
 * @date 2020 09 14
 */
public class Demo {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.add("JAVA");

        ListTools.traverse(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(111);
        list2.add(222);
        list2.add(333);

        ListTools.traverse(list2);



    }

}

class ListTools{

    public static void traverse(List<?> list){

        for (Object obj : list) {
            System.out.println(obj);
        }

    }

}