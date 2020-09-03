package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 28
 */
public class Demo10 {
    public static void main(String[] args) {

        //直接排序
        int[] arr = {49,38,65,97,76,13,27,49};
        //思路：
        /*
        第0轮(i=0)：比较arr.length - 1次
        第1轮(i=1)：比较arr.length - 2 次
        第2轮(i=2)：比较arr.length - 3 次
        所以：arr.length - i - 1
         */

        for(int j = 0; j < arr.length - 1; j++){
            int min = j;
            for (int i = j + 1; i < arr.length; i++) {
                if(arr[min] > arr[i]){
                    min = i;
                }
            }
            if(min != j){
                int temp = arr[j];
                arr[j] = arr[min];
                arr[min] = temp;
            }
        }

        for (int k : arr){
            System.out.print(k + "\t");
        }

    }
}
