package com.atguigu.java;

/**
 * 动态初始化二：数据类型[][] 数据名 = new 数据类型[m][];
 *      m：有m个一维数组
 *      数组名[0] = 新的一维数组
 *
 *
 * @author oono
 * @date 2020 08 29
 */
public class Demo3 {
    public static void main(String[] args) {

        //不规则二维表
        int[][] arr = new int[3][];

        System.out.println(arr[0]);//null

        arr[0] = new int[]{1,2,3};
//        arr[1] = {4,5};
        arr[1] = new int[]{4,5};
        arr[2] = new int[6];

        System.out.println(arr[0]);//一维数组地址
        System.out.println(arr[0][2]);//2
        System.out.println(arr[2][1]);//角标越界异常（运行时异常）


    }
}
