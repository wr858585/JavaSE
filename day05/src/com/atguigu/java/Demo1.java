package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 28
 */
public class Demo1 {
    public static void main(String[] args) {

        int[] arr = {23,1,4,66,14};

        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组的元素值和是：" + sum);//108

        //求平均值
        double avg = (double)sum / arr.length;
        System.out.println("数组的平均值是：" + avg);//21.6

        //求偶数的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("数组中的偶数个数是：" + count);//3



    }
}
