package com.atguigu.java;

import java.util.Arrays;

/**
 * Arrays工具类
 * @author oono
 * @date 2020 08 28
 */
public class Demo11 {
    public static void main(String[] args) {

        int[] arr = {49,38,27,97,13,27,49};

        //排序sort
        Arrays.sort(arr);

        //二分查找binarySearch（需要先对数组排序！）
        int index = Arrays.binarySearch(arr, 38);
        System.out.println(index);//3

        //把数组转换成一个字符串 --> 所以叫toString
        System.out.println(Arrays.toString(arr));//[13, 27, 27, 38, 49, 49, 97]

    }
}
