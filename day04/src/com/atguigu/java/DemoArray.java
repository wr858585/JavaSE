package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 26
 */
public class DemoArray {
    public static void main(String[] args) {

        //1. 声明数组
        int[] arr;//推荐
        int arr2[];

        //2. 初始化赋值
        //本质上，初始化是在内存中开辟一个空间
        //方式一：静态初始化
        arr = new int[]{1,2,3};
        int[] arr3 = {1,2,3,4};//简化方式，也可以，但是不能分开声明和初始化赋值
        //方式二：动态初始化
        String[] names = new String[3];

        //3. 使用数组
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //4. 数组赋值
        names[0] = "Tom";
        names[1] = "Jack";
        names[2] = "Rose";

        System.out.println(names[0] + "\n" + names[1] + "\n" + names[2]);

    }
}
