package com.atguigu.homework;

import java.util.Scanner;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Question11 {
    public static void main(String[] args) {

        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        int year,month,date;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        year = sc.nextInt();
        System.out.println("请输入月份：");
        month = sc.nextInt();
        System.out.println("请输入日期：");
        date = sc.nextInt();
        int days = date;

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            arr[1] = 29;
        }

        for (int i = 0; i < month - 1; i++) {
            days += arr[i];
        }

        System.out.println("该日是当年的第" + days + "天");

    }
}
