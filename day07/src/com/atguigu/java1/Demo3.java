package com.atguigu.java1;

/**
 * @author oono
 * @date 2020 08 31
 */
public class Demo3 {

    public static void main(String[] args) {

        int[] arr = {10,20};

        change(arr);

        System.out.println(arr[0]);//11
        System.out.println(arr[1]);//21

    }

    public static void change(int[] arr){
        arr[0]++;
        arr[1]++;
        arr[1]++;
    }
}
