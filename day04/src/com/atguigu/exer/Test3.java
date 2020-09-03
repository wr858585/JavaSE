package com.atguigu.exer;

import java.util.Scanner;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Test3 {
    public static void main(String[] args) {
        String[] weeks = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：（1-7）");
        int num = sc.nextInt();
        System.out.println(weeks[num - 1]);//index是从0开始，所以要-1，否则index不对
    }
}
