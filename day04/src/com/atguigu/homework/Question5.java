package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Question5 {
    public static void main(String[] args) {

        int hundred, ten, digit;

        for(int i = 100; i < 1000; i++){
            hundred = i / 100;
            ten = (i - hundred * 100) / 10;
            digit = i - hundred * 100 - ten * 10;
            if(i == hundred*hundred*hundred + ten*ten*ten + digit*digit*digit){
                System.out.println(i);
            }
        }

    }
}
