package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 28
 */
public class Demo3 {
    public static void main(String[] args) {

        int[] arr = {12,3,4,66,7,32,13,66};

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >= arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println("数组中的最大值是：" + arr[arr.length - 1]);

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] <= arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println("数组中的最小值是：" + arr[arr.length - 1]);

    }
}
