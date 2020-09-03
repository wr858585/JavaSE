package com.atguigu.homework;

import java.util.Scanner;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("身高：(cm)");
        int height = sc.nextInt();
        System.out.println("钱：(千万)");
        int money = sc.nextInt();
        System.out.println("帅吗：(true/false)");
        boolean isHandsome = sc.nextBoolean();

        if(height >= 180 && money >= 1000 && isHandsome == true){
            System.out.println("一定嫁给他");
        }
        if(height >= 180 || money >= 1000 || isHandsome == true){
            System.out.println("还可以");
        }
        if(height < 180 && money < 1000 && isHandsome == false){
            System.out.println("no!");
        }


    }
}
