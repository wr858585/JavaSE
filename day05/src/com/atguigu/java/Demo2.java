package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 28
 */
public class Demo2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int num = 11;
        int index = -1;//默认值为-1，表示未找到

        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                index = i;
                break;
            }
        }

        System.out.println(index);

    }
}
