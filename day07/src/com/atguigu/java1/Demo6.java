package com.atguigu.java1;

/**
 * @author oono
 * @date 2020 08 31
 */
public class Demo6 {
    public static void main(String[] args) {

        int a = 10, b = 5, c = 12;
        int max = max(a, c);
        System.out.println(max);

    }

    public static int max(int a, int b){
        return (a > b)? a : b;
    }
    public static int max(int a, int b, int c){
        int temp = (a > b)? a : b;
        return (temp > c)? temp : c;
    }
    public static double max(double a, double b){
        return (a > b)? a : b;
    }
}
