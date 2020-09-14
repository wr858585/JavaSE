package com.atguigu.java;

import java.util.LinkedList;

/**
 * LinkedList 有很多方法，如push(E ele)压栈，pop()弹栈，来做出stack ADT
 * @author oono
 * @date 2020 09 12
 */
public class LinkedListMakingStack {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        //push(E ele)：压栈
        list.push(11);
        list.push(22);
        list.push(33);
        System.out.println(list);
        System.out.println("----------");

        //pop()：弹栈
        list.pop();
        System.out.println(list);
        System.out.println("----------");
        System.out.println(list.pop());
        System.out.println(list);

        //通过push和pop方法就实现了stack：先进后出（先push进来的元素压在最下面！）

    }

}
