package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 28
 */
public class Demo4 {
    public static void main(String[] args) {

        int[] arr = {4,5,6,1,9,1};
        int min = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }

        int count = 0;
//        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if(min == arr[i]){
                count++;
//                if(flag) {
//                }
//                flag = false;
            }
        }

        System.out.println("最小值第一次出现的位置：" + index);
        System.out.println("最小值的个数：" + count);
    }
}
