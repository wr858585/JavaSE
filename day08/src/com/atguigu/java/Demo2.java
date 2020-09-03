package com.atguigu.java;

/**
 * 斐波那契数列：f(n) = f(n-1) + f(n-2) --> 1 1 2 3 5 8 13 21
 * @author oono
 * @date 2020 09 01
 */
public class Demo2 {

    public static void main(String[] args) {

        Demo2 test = new Demo2();
        int num = test.getNum(8);
        System.out.println(num);//21

    }

    public int getNum(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        n = getNum(n - 1) + getNum(n - 2);
        return n;
    }

}
