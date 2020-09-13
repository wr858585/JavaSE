package com.atguigu.java;

import java.util.*;

/**
 * @author oono
 * @date 2020 09 13
 */
public class MapTest {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap();

        map.put(1,"marry");
        map.put(2,"narry");
        map.put(3,"rarry");
        map.put(4,"qarry");
        map.put(5,"darry");

        //遍历Map
        //方式一：keySet()
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("-----");
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("-----");

        //方式二：values()
        //注意：values只能用Collection类型存储，因为可以重复不能用set
        Collection<String> values = map.values();

        //方式三：entrySet()
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> e : entries){
            System.out.println(e);
            System.out.println("-----");
            Integer key = e.getKey();
            String value = e.getValue();
            System.out.println(key + "=" + value);
            System.out.println("-----");
        }




    }


}
