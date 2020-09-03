package com.atguigu.java;

/**
 * 空指针异常
 * @author oono
 * @date 2020 08 29
 */
public class Demo5 {
    public static void main(String[] args) {

        int[][] arr = new int[3][];

        System.out.println(arr[0].length);//空指针异常

    }
}
