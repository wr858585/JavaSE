package com.atguigu.java;

/**
 * 数组元素的删除
 * @author oono
 * @date 2020 08 28
 */
public class Demo8 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        //删除指定index的元素
        int index = 1;

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;

        for (int i : arr){
            System.out.print(i + "\t");
        }


    }
}
