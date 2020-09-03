package com.atguigu.exer;

import java.util.Scanner;

/**
 * 用一个数组存储本组学员的年龄，从键盘键入，并遍历
 * @author oono
 * @date 2020 08 26
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5个整数");
        int[] ages = new int[5];
        for (int i = 0; i < 5; i++) {
            ages[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(ages[i]);
        }

        //用一个数组存储本组学员的名字，遍历
        String[] names = new String[5];
        System.out.println("请输入5个名字");
        for (int i = 0; i < 5; i++) {
            names[i] = sc.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
    }
}
