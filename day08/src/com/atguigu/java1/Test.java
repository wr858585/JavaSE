package com.atguigu.java1;

import java.util.*;

/**
 * @author oono
 * @date 2020 09 01
 */
public class Test {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1, "a");
        map.put(2, "ba");
        map.put(1,"bd");

        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator iterator1 = map.values().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        Iterator iterator2 = map.entrySet().iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }





    }



}
