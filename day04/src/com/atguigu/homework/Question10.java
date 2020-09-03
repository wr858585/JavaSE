package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Question10 {
    private int sum;

    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        int max = 0, min = 0, sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("选手的平均分是：" + (sum - max - min) / (arr.length - 1));
    }
}
