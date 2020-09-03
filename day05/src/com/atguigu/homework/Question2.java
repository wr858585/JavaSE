package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 28
 */
public class Question2 {
    public static void main(String[] args) {

        int[] arr = {26, 67, 49, 38, 52, 66, 7, 71, 56, 87};

        for (int left = 0, right = arr.length - 1; left < right; ) {

            while(arr[left] % 2 != 0){
                left++;
            }
            while(arr[right] % 2 == 0){
                right--;
            }

            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        for (int i : arr){
            System.out.print(i + "\t");
        }
    }
}
