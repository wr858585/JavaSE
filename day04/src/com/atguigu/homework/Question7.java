package com.atguigu.homework;

import java.util.Scanner;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        int m = sc.nextInt();
        int n = sc.nextInt();
        //排序，让m是较大者
        int max = (m > n)? m : n;
        int min = (m > n)? n : m;

        for(int i = min; i > 0; i--){
            if (max % i == 0 && min % i == 0) {
                System.out.println("最大公约数为：" + i);
                break;
            }
        }

        for (int i = max;; i++) {
            if(i % max == 0 && i % min == 0){
                System.out.println("最小公倍数为：" + i);
                break;
            }
        }
    }
}
