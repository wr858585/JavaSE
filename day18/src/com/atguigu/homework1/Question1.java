package com.atguigu.homework1;

import java.util.*;

/**
 * 1. 一个字符串，包含了空格等标点符号，写一个函数计算出出现次数最多的字母，以及该字母出现的次数
 * @author oono
 * @date 2020 09 14
 */
public class Question1 {

    public static void main(String[] args) {

        String str = "Your future depends on your dreams, so go to sleep.";
        char[] chars = str.toCharArray();
//        int[] counts = new int[chars.length];

        //获取所有字母，放进ArrayList容器
        List<Character> keysOriginal = new ArrayList<>();
        for (char aChar : chars) {
            keysOriginal.add(aChar);
        }

        //获取所有字母，放进TreeSet容器
        Set<Character> keys = new TreeSet<>();
        keys.addAll(keysOriginal);

        //把不重复的key放回一个list
        List<Character> keys1 = new ArrayList<>();
        keys1.addAll(keys);

        Set<Character> set = new HashSet();
        for (int i = 65; i < 65 + 26; i++) {
            set.add((char)i);
        }
        for (int i = 97; i < 97 + 26; i++) {
            set.add((char)i);
        }

        //取交集，只保留大小写字母共52个
        keys1.retainAll(set);
        System.out.println("源字符串中的所有字符：" + keysOriginal);
        System.out.println("该字符串所包含的字母为：" + keys1);

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < keys1.size(); i++) {
            map.put(keys1.get(i), Collections.frequency(keysOriginal, keys1.get(i)));
        }

        System.out.println(map);
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        int max = map.get(keys1.get(0));

        for (Map.Entry<Character, Integer> e : entries) {
            max = (e.getValue() > max)? e.getValue() : max;
        }

        for (Map.Entry<Character, Integer> e : entries) {
            if(e.getValue() == max){
                System.out.println("出现的最频繁的字母是：" + e.getKey());
                System.out.println("出现的次数是：" + max);
            }
        }

    }

}
