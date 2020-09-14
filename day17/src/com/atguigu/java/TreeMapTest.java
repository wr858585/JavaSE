package com.atguigu.java;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author oono
 * @date 2020 09 13
 */
public class TreeMapTest {

    public static void main(String[] args) {

        Map<Integer,String> map = new TreeMap<>();

        map.put(110,"call the police");
        map.put(120,"call the ambulance");
        map.put(119,"call the fireman");
        map.put(114,"call the helper");

         for(Integer key : map.keySet()){
             String value = map.get(key);
             System.out.println(key + "=" + value);
         }

    }

}
