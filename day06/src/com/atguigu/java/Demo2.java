package com.atguigu.java;

/**
 * 二维数组的动态初始化
 * 1. 基本格式：数据类型[][] 数组名 = new 数据类型[m][n];
 *      m：二维数组有m个一维数组
 *      n：每个一维数组的长度
 *
 *
 * @author oono
 * @date 2020 08 29
 */
public class Demo2 {
    public static void main(String[] args) {

        //情况1. 规则二维数组
        int[][] arr = new int[3][3];//元素有默认初始值
        //访问数组
        System.out.println(arr);//二维数组的地址
        System.out.println(arr[0]);//一维数组的地址
        System.out.println(arr[0][0]);//0
        //重新赋值
        arr[0][0] = 11;
        arr[0][1] = 22;
        System.out.println(arr[0][0]);//11
        System.out.println(arr[0][1]);//22

    }
}
