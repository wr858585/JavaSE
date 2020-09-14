package com.atguigu.java;

import java.util.LinkedList;

/**
 * @author oono
 * @date 2020 09 12
 */
public class LinkedListTest {

    public static void main(String[] args) {

        //创建一个LinkedList集合对象
        LinkedList<Integer> list = new LinkedList<>();

        list.add(123);
        System.out.println(list);

        //增
        //add(int index);addFirst();addLast()
        list.add(0,456);
        list.addFirst(789);
        list.addLast(200);
        list.addFirst(100);
        System.out.println(list);

        System.out.println();

        //查
        //get(int index);getFirst();getLast()
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println();

        //删
        //removeFirst();removeLast()
        list.removeFirst();
        list.removeLast();
        System.out.println(list);


    }

}
