package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 28
 */
public class ReverseTest {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr1 = new int[arr.length];

        //方式一：创建一个新数组，反转获取元素
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];
        }

        for (int i : arr1){
            System.out.print(i +"\t");
        }

        System.out.println();

        //方式二：在原数组中实现反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i : arr){
            System.out.print(i + "\t");
        }




    }
}
