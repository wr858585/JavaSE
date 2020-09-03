package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 26
 */
public class Question8 {
    public static void main(String[] args) {

        int factor;

        for (int num = 0; num < 1000; num++) {
            factor = 0;
            for (int i = 1; i < num; i++) {
                if(num % i == 0){
                    factor += i;
                }
            }
            if(num == factor){
                System.out.println(num);
            }
        }
    }
}
