package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Question6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 150; i++) {
            System.out.print(i);
            if(i % 3 == 0){
                System.out.print("\tfoo");
            }
            if(i % 5 == 0){
                System.out.print("\tbiz");
            }
            if(i % 7 == 0){
                System.out.print("\tbiz");
            }
            System.out.println();

        }
    }
}
