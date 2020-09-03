package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 28
 */
public class Demo7 {
    public static void main(String[] args) {

        //在数组的index=1的位置上插入数字0
        int[] arr = {1,2,3,4};
        int index = 1;

        int[] arr1 = new int[arr.length + 1];

        for (int i = 0; i < arr1.length - 1; i++) {
            arr1[i] = arr[i];
        }

        //{1,2,3,4,0}

        for (int i = arr1.length - 2; i >= index; i--) {
            arr1[i + 1] = arr1[i];
        }

        arr1[index] = 0;

        for(int i : arr1){
            System.out.print(i + "\t");
        }


    }
}
