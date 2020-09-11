package com.atguigu.java1;

import org.junit.Test;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/**
 * @author oono
 * @date 2020 09 11
 */
public class ArrayListTest {

    public static void main(String[] args) {
        List list = new ArrayList();

        //添加元素
        //void add(E ele)

        list.add("tom");
        list.add(1,"jack");

        List list1 = new ArrayList();
        list1.add(0,123);
        list1.add(0,456);

        System.out.println("list = " + list);//list = [tom, jack]
        list.addAll(list1);
        System.out.println("list = " + list);//list = [tom, jack, 456, 123]

        System.out.println(list.size());//4

        //插入元素
        //void add(int index, E ele)
        //插入元素也是add()方法，但是可以限制索引位置[0,size]
        list.add(list.size(),000);
        System.out.println("list = " + list);//list = [tom, jack, 456, 123, 0]
        //但其实在list.size()的地方插入，就是简单的添加（在末尾了），直接add(E ele)即可
    }

    @Test
    public void testGetIndex(){

        /*
        增
        E getIndex(int index)
        List subList(int fromIndex, int toIndex)
         */

        List list = new ArrayList();
        list.add("11");
        list.add("33");
        list.add("22");
        list.add("44");

        System.out.println(list.get(0));//11
        System.out.println(list.get(2));//22

        List list1 = list.subList(1, 3);
        System.out.println(list1);//[33, 22]，左闭右开（助记：长度 = end - start)

        /*
        删
        E remove(int index)：返回值为被删除的元素
         */

        Object remove = list.remove(3);
        System.out.println("remove = " + remove);////remove = 44
        System.out.println("list = " + list);//list = [11, 33, 22]

        /*
        改元素
        E set(int index, E ele)
         */
        Object o = list.set(2, "我改");
        System.out.println("o = " + o);//o = 22
        System.out.println("list = " + list);//list = [11, 33, 我改]

        /*
        查
        int indexOf(Object obj)
        int lastIndexOf(Object obj)
         */

        System.out.println(list.indexOf("44"));//-1








    }




}
