package com.atguigu.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author oono
 * @date 2020 09 13
 */
public class LinkedHashMapTest {

    public static void main(String[] args) {

        Map map = new LinkedHashMap();

        map.put(112,"hello");
        map.put(122,"world");
        map.put(221,"JAVA");
        map.put(124,"Tom");

        Set keys = map.keySet();

        System.out.println(keys);//[112, 122, 221, 124]

        System.out.println(map);//{112=hello, 122=world, 221=JAVA, 124=Tom}

        //遍历的顺序是元素添加的顺序

    }

}
