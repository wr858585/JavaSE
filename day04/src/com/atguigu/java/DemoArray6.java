package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 26
 */
public class DemoArray6 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;

        int[] arr2 = new int[2];
        System.out.println(arr2[0]);//0
        System.out.println(arr2[1]);//0

        arr2 = arr;

        System.out.println(arr[0]);//11
        System.out.println(arr[1]);//12

    }
}
