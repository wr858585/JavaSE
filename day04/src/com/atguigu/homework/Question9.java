package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Question9 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();

        }

    }
}
