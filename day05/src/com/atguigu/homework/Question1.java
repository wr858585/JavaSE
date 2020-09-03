package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 28
 */
public class Question1 {
    public static void main(String[] args) {

        /*
        找出数组中一个值，使其左侧值的加和等于右侧值的加和，
        例如：[1,2,5,3,2,4,2]，结果为：第4个值3
        [9, 6, 8, 8, 7, 6, 9, 5, 2, 5]，结果是没有
         */

        int[] arr = {1, 2, 5, 3, 2, 4, 2};
        boolean flag = true;

        for (int i = 1; i < arr.length; i++) {

            //leftSum和rightSum每次一个大轮（外层循环结束后），都应该重置，否认继续延用已经操作过的数据，结果错误
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = arr.length - 1; j > i; j--) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                System.out.println("找到一个值，索引为：" + i);
                flag = false;
            }

        }

        if (flag) {
            System.out.println("不存在这样的数");
        }


    }
}
