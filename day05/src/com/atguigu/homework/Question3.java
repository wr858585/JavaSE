package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 28
 */
public class Question3 {
    public static void main(String[] args) {

        int[] arr = {6, 7, 6, 7, 10, 6, 6, 10, 6, 2};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            //跟外层循环arr[i]比较的元素，头：应该会在i之后1个开始；尾：应该在最后一个元素-已经放置了重复的元素，并置于后面的元素之前
            for (int j = i + 1; j < arr.length - count; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    for (int k = j; k < arr.length - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    j--;//debug不然很难看出来(对于两个连续的重复数字的时候，如果不把j再调回去，回少删除相同的元素）
                }
            }
        }

        int[] arr1 = new int[arr.length - count];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        for (int i : arr1){
            System.out.print(i + "\t");
        }
    }

}

