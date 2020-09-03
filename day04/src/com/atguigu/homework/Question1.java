package com.atguigu.homework;

import java.util.Scanner;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sc.nextDouble();
        if(score >= 60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
}
