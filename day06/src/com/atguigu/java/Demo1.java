package com.atguigu.java;

/**
 * 二维数组的初始化
 * @author oono
 * @date 2020 08 29
 */
public class Demo1 {
    public static void main(String[] args) {

        //1. 先声明，再初始化

        int[][] arr;//推荐
        int arr1[][];
        int[] arr2[];
        int[] a,b[];//a是一维数组，b是二维数组

        arr = new int[][]{{1,2,3},{1,2},{1,2,3}};//静态初始化，程序员给定初始值

        //2. 声明+初始化

        int[][] arr3 = new int[][]{{1,2},{3}};

        //3. 简化版
        int[][] arr4 = {{1,2,3},{1},{2,3,4,5}};//静态初始化常用简化版

        //4. 访问二维数组
        System.out.println(arr);//[[I@1540e19d
        System.out.println(arr[0]);//[I@677327b6
        System.out.println(arr[1]);//[I@14ae5a5
        System.out.println(arr[2]);//[I@7f31245a
        System.out.println(arr[0][0]);//1




    }
}
