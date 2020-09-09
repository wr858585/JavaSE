package com.atguigu.java1;

import org.junit.Test;

/**
 * StringBuffer, StringBuilder
 * @author oono
 * @date 2020 09 08
 */
public class Demo {

    @Test
    public void test1(){

        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        sb.append("abc");

        System.out.println("sb = " + sb);//sb = abcabc

        //StringBuffer --> String
        //方式一：用String的构造器
        String str = new String(sb);
        System.out.println("str = " + str);//str = abcabc

        //方式二：用StringBuilder的toString()方法
        String str1 = sb.toString();
        System.out.println("str1 = " + str1);//str1 = abcabc

        //String --> StringBuilder
        //用StringBuilder的构造器
        StringBuilder sb1 = new StringBuilder(str1);
        System.out.println("sb1 = " + sb1);//sb1 = abcabc

    }

    //获取20个在[3,15]的随机整数
    @Test
    public void test2(){

        int[] arr = new int[50];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (15 -3) + 3);
        }

        for (int elements : arr){
            System.out.println(elements);
        }

    }


}
