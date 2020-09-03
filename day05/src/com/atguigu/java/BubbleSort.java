package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 28
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {6,3,8,2,9,1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr){
            System.out.print(i + "\t");
        }

    }
}
