package com.atguigu.java;

import java.util.LinkedList;

/**
 * LinkedList 实现了很多若干方法，比如offer(E ele)添加，poll()取出，来用来造成队列ADT
 *
 * @author oono
 * @date 2020 09 12
 */
public class LinkedListMakingQueue {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.offer("hello");
        System.out.println(list);
        list.offer("world");
        list.offer("JAVA");
        System.out.println(list);

        String s1 = list.poll();
        System.out.println(s1);
        System.out.println(list);

        System.out.println("-------------");

        System.out.println(list.poll());
        System.out.println(list);

        System.out.println("-------------");

        list.offer("html");
        System.out.println(list);

        System.out.println("-------------");

        System.out.println(list.poll());
        System.out.println(list);

        //offer(E ele)：添加一个元素
        //poll()：删除一个元素

        //以上逻辑就可以做成一个队列：先进先出
    }

}
