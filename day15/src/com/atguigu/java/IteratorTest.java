package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator
 * 1. java提供了专门用来遍历集合Collection的类Iterator（否则要转成数组用for遍历）
 * @author oono
 * @date 2020 09 11
 */
public class IteratorTest {

    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("JAVA");

        /*
        Iterator类：
        boolean hasNext()：判断是否有下一个元素
        E next()：获取下一个元素
        void remove()：删除一个元素
         */

        //Iterator实例化
        //抽象类，不能new。要通过list来调用iterator()方法生成
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /*
        hello
        world
        JAVA
         */

        //若此时再用同一个iterator.next()来获取下一个元素，则会报NoSuchElementException
        //因为这个迭代器的指针已经到list的最后一个元素的位置了，再往下就没有元素了
        //solution：需要生成一个新的iterator1，来重新遍历if needed
//        System.out.println(iterator.next());//NoSuchElementException

        Iterator iterator1 = list.iterator();
        System.out.println(iterator1.next());//hello
        System.out.println(iterator1.next());//world





    }


}
