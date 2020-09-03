package com.atguigu.java;

/**
 * 数组的扩容
 *
 * @author oono
 * @date 2020 08 28
 */
public class Demo6 {
    public static void main(String[] args) {

        //在数组基础上新添加一个数据，在最末位置
        int[] arr = {1, 2, 3, 4, 5};
        //假设新添加的元素是10
        int num = 10;
        int[] arr1 = new int[arr.length + 1];
        arr1[arr1.length - 1] = num;
        for (int i = 0; i < arr1.length - 1; i++) {
            arr1[i] = arr[i];
        }

        arr = arr1;

        for (int i : arr) {
            System.out.print(i + "\t");
        }




    }
}
