package com.atguigu.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List接口有一个自己的专门的Iterator接口，里面基于List集合的特点，提供了更多的iterator可操作的方法
 * 如：add(E element)，hasPrevious(),previous()等等
 * @author oono
 * @date 2020 09 12
 */
public class ListIteratorTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();

        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("----------");

        //list.listIterator()里面可以放int index，表示指针的初始位置，下面才能从下往上遍历
        ListIterator<Integer> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
