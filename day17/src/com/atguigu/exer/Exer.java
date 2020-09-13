package com.atguigu.exer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author oono
 * @date 2020 09 13
 */
public class Exer {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("Lynett","Scarvo");
        map.put("Tom","Scarvo");
        map.put("Susan","Mayor");
        map.put("Mike","Dolfino");
        map.put("Gabrille","Sollis");
        map.put("Carlos","Sollis");
        map.put("Rex","null");
        map.put("Bree","Van De Camp");

        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string + "=" + map.get(string));
        }

        System.out.println("-----");

        Set<Map.Entry<String,String>> entries = map.entrySet();
        Iterator<Map.Entry<String,String>> it =entries.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }

}
