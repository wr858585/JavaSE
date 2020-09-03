package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 26
 */
public class DemoArray4 {
    public static void main(String[] args) {
        //动态初始化 --> 开辟内存空间，并赋值（系统给出默认值，根据数类）
        /*
        默认初始值：
        数值型：0/0.0
        char：0/'\u0000'
        布尔：false
        引用数类：null
         */
        int[] arr = new int[3];
        System.out.println(arr[0]);//0
        String[] arr2 = new String[3];
        System.out.println(arr2[0]);//null


    }
}
