package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 28
 */
public class BinarySearch {
    public static void main(String[] args) {

        //二分查找的前提：数组已经从小到大排序好了
        int[] arr = {2,5,7,8,10,15,18,20,22,25,28};

        //顺序查找的时间复杂度：O(n)，即跟数组的长度有关，成正比

        //二分查找/折半查找：O(nlog2n)，外层n，内层log2n
        int value = 22;//要找的值
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        int index = -1;

        //没办法确定循环的次数，建议用while循环了
        while(left <= right){
            if(arr[mid] == value){
                index = mid;
                break;
            }else if(value > arr[mid]){
                left = mid + 1;//重置左边界
            }else{
                right = mid - 1;//重置右边界
            }
            mid = (left + right) / 2;//重新计算新的mid值，否则死循环
        }

        System.out.println("index=" + index);

    }
}
