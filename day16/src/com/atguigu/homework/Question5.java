package com.atguigu.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 1、请定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
 * 2、创建集合，集合存放随机生成的30个小写字母
 * 3、用listTest统计，某些元素的出现次数
 * @author oono
 * @date 2020 09 12
 */
public class Question5 {

    public static void main(String[] args) {

        Collection<Character> chars = new ArrayList();

        for (int i = 0; i < 30; i++) {
            chars.add((char)(Math.random() * 26 + 97));
        }

        System.out.println("随机生成的30个字母为：");
        System.out.println(chars);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的字母：");
        char i = sc.next().charAt(0);
        int a = listTest(chars, String.valueOf(i));
        System.out.println("字母" + i + "出现的次数是：" + a);


    }

    public static int listTest(Collection list, String s){
        int count = 0;
        Iterator<Character> it = list.iterator();
        while(it.hasNext()){
            Character c = it.next();
            if(s.equals(String.valueOf(c))){
                count++;
            }
        }
        return count;
    }

}
