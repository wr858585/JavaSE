package com.atguigu.java1;

/**
 * @author oono
 * @date 2020 08 31
 */
public class Demo2 {
    public static void main(String[] args) {

        byte b1 = 10, b2 = 20;
        boolean equals = equals(b1, b2);
        System.out.println(equals);//false

    }

    public static boolean equals(byte a, byte b){
        return a == b;
    }
    public static boolean equals(short a, short b){
        return a == b;
    }

}
