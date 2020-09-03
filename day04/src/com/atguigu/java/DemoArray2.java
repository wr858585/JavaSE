package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 26
 */
public class DemoArray2 {
    public static void main(String[] args) {

        //声明并初始化
        int[] arr = {11,22,33,44,55};
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //倒着遍历
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }

    }
}
