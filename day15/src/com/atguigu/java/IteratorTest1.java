package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 1. 一个类如果实现了Iterable接口，就可以用增强for了。因为iterator()方法是定义在Iterable接口中的
 * 比如：public interface Collection<E> extends Iterable<E>{...}
 * 而数组就并没有
 *
 * 2. fail-fast机制
 * ① 集合类中有的属性：modCount --> 修改次数
 * ② 作用：限制在遍历时对集合中的元素进行修改（intuition：边数人边删除成员，这种操作容易有问题，不允许）
 * ③ 具体实现SC：判断modCount != expectedModCount，不相等的话throw new ConcurrentModificationException并发修改异常
 * ④ 简而言之，在用迭代器进行遍历的时候，java不允许再用集合中的方法对集合中的元素进行操作，直接fast-fail（java认为有隐患）
 * @author oono
 * @date 2020 09 11
 */
public class IteratorTest1 {

    public static void main(String[] args) {

        Collection<String> list= new ArrayList<>();

        list.add("孙悟空");
        list.add("李逵");
        list.add("沙僧");
        list.add("李鬼");

        Iterator iterator = list.iterator();

        //fast-fail：通过集合的方法，fast-fail
/*
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if("李鬼".equals(obj)){
                list.remove(obj);
            }
        }
*/

        //用迭代器自己的remove()方法，可以
        //相当于说用迭代器遍历的时候，不能再去用其他的东西的方法，容易出错所以直接fast-fail报错ConcurrentModificationException
        //而迭代器遍历的时候，用迭代器自己的方法则可以进行操作，不会有异常
        while(iterator.hasNext()){
            if("李鬼".equals(iterator.next())){
                iterator.remove();//
            }
        }

        for (String s : list) {
            System.out.println(s);
        }

    }

}
