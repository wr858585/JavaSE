package com.atguigu.homework;

import java.util.Arrays;

/**
 * @author oono
 * @date 2020 08 28
 */
public class Question5 {
    public static void main(String[] args) {

        int[] arr = new int[]{3,5,1,8,2,4,9};

        //Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        String s = Arrays.toString(arr);
        System.out.println(s);
        
        //Direct sort
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//        }

    }
}
