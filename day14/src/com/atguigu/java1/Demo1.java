package com.atguigu.java1;

import org.junit.Test;

import java.util.Arrays;

/**
 * Arrays工具类
 *
 * @author oono
 * @date 2020 09 09
 */
public class Demo1 {

    int[] arr = {5, 12, 76, 34, 2, 77, 9, 4};

    @Test
    public void testCopyOf() {
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copy));//[5, 12, 76, 34, 2, 77, 9, 4]
    }

    @Test
    public void testCopyOfRange() {
        int[] copy1 = Arrays.copyOfRange(arr,2,5);//[2,5)
        System.out.println(Arrays.toString(copy1));//[76, 34, 2]
    }

    @Test
    public void testEquals(){
        System.out.println(Arrays.equals(Arrays.copyOf(arr,arr.length),arr));//true，比较两个数组里的元素是否一样。而非比地址in Object类
    }

    @Test
    public void testFill(){
        Arrays.fill(arr,0,1,0);//[0.1)
        System.out.println(Arrays.toString(arr));//[0, 12, 76, 34, 2, 77, 9, 4]
    }

    @Test
    public void testBinarySearch(){
        System.out.println(Arrays.binarySearch(arr,77));//5
        System.out.println(Arrays.binarySearch(arr,0));//-1
    }

    @Test
    public void testSort(){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[2, 4, 5, 9, 12, 34, 76, 77]
    }

}
