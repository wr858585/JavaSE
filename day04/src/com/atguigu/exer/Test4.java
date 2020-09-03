package com.atguigu.exer;

import java.util.Scanner;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Test4 {
    public static void main(String[] args) {

        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年：");
        int year = sc.nextInt();
        System.out.println("请输入月：");
        int month = sc.nextInt();
        System.out.println("请输入日：");
        int date = sc.nextInt();

        int days = date;

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            arr[1] = 29;
        }

        //求指定月份之前的所有天数之和（不包括本月的天数）
        for (int i = 0; i < month - 1; i++) {
            days += arr[i];
        }

        System.out.println("今天是本年的第" + days + "天");

    }
}
