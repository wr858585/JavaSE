package com.atguigu.homework;

import java.util.Scanner;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = sc.nextInt();

        if(score > 100 || score < 0){
            System.out.println("成绩输入有误");
        }else if(score == 100){
            System.out.println("奖励一台BMW");
        }else if(score > 80){
            System.out.println("奖励一台IPhone");
        }else if(score > 60){
            System.out.println("奖励一台IPad");
        }else{
            System.out.println("挨打");
        }
    }
}
