package com.atguigu.java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections工具类里的静态方法
 * @author oono
 * @date 2020 09 13
 */
public class CollectionsTest {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("JAVA");
        list.add("LINUX");

        //mtd1. addAll(Collection coll, E... ele)
        Collections.addAll(list,"python","C#");
        System.out.println(list);

        //mtd2. sort(Collection coll,
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return s1.compareTo(s2);
                }
                throw new RuntimeException();
            }
        });
        System.out.println(list);

        //mtd3. binarySearch(Collection, Object key)
        int java = Collections.binarySearch(list, "JAVA");
        System.out.println(java);

    }
}
