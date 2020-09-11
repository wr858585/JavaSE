package com.atguigu.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合Collection
 * 1. 集合：存储数据的容器（数组也是）
 * 2. 为什么用集合
 * ① 长度可以更改（实际上还是底层直接扩容，转移到新的数组中）
 * ② 提供更多方法，增删改查插入长度遍历
 * ③ 数组可以存基本数类和引用数类；集合只能存储引用数类（包装类可以）
 * ④ 数组只能存储有序、可重复是数据；集合有很多实现类，可以存储许多不同需求的数据
 * 3. 集合框架
 * |--Collection接口：存储单列数据
 *      |--List接口：存储有序的、可重复的单列数据
 *          |--ArrayList实现类
 *              |--LinkedArrayList子类
 *          |--Vector实现类
 *      |--Set接口：存储无序的、不可重复的单列数据、
 *          |--HashSet实现类
 *              |--LinkedHashSet子类
 *          |--TreeSet实现类
 * |--Map接口：存储双列数据
 *      |--HashMap实现类
 *          |--LinkedHashMap子类
 *      |--TreeMap实现类
 *      |--HashTable实现类
 *      |--Properties实现类
 *
 * @author oono
 * @date 2020 09 11
 */
public class CollectionTest {

    public static void main(String[] args) {

        Collection list = new ArrayList();

        //添加元素
        //void add(Object obj)方法
        list.add(11);
        list.add(22);
        list.add(33);

        System.out.println(list);//[11, 22, 33]，重写过toString

        //void addAll(Collection other)方法

        Collection list1 = new ArrayList();
        list1.add(44);
        list1.add(33);
        list1.add(55);

        list.addAll(list1);
        System.out.println(list);//[11, 22, 33, 44, 33, 55]

        //删除元素
        //boolean remove(Object obj)
        boolean remove = list.remove(11);
        System.out.println(list);//[22, 33, 44, 33, 55]
        System.out.println(remove);//true

        //boolean removeAll(Collection<?> coll)
        list.removeAll(list1);
        System.out.println(list);//[22]，会删除所有list1中的元素（如果list中有重复多个某个list1中的元素，则全部删除）

        //判断
        //boolean isEmpty()
        System.out.println(list.isEmpty());//false

        //boolean contains(Object obj)
        System.out.println(list.contains(22));//true

        //boolean containsAll(Collection other)
        System.out.println(list.containsAll(list1));//false，要包含所有形参传入的集合的元素，才会返回true

        System.out.println("--A--");

        //长度
        //int size()
        System.out.println(list.size());//1

        System.out.println("--B--");

        //交集
        //boolean retainAll(Collection other)
        boolean b = list.retainAll(list1);
        System.out.println(b);//true
        System.out.println(list);//[]

        System.out.println("--C--");

        //遍历
        //toArray()
        Object[] arr = list.toArray();
        for (Object e : arr){
            System.out.println(e);
        }//null

        System.out.println("--D--");




    }



}
