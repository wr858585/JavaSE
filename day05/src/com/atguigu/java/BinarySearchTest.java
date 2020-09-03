package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 28
 */
public class BinarySearchTest {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,9,11,24,66,888,2312};

        int value = 66;//要找的元素
        int index = -1;//要找的元素所在的索引
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while(left <= right){
            mid = (left + right) / 2;
            if(value == arr[mid]){
                index = mid;
                break;
            }else if(value > arr[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        System.out.println("index=" + index);//index=8

    }
}
