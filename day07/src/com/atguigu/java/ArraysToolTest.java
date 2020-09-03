package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 31
 */
public class ArraysToolTest {
    public static void main(String[] args) {

        int[] arr = {12,34,5,6,7};

        ArraysTool.printArr(arr);//由于是static方法，所以无需造对象

        System.out.println("程序结束");

    }
}
