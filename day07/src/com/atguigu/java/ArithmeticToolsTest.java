package com.atguigu.java;

/**
 * @author oono
 * @date 2020 08 31
 */
public class ArithmeticToolsTest {
    public static void main(String[] args) {

        double div = ArithmeticTools.div(5, 2);
        System.out.println(div);

        ArithmeticTools.getNums(12);//1 2 3 4 6 12
        System.out.println();

        boolean prime = ArithmeticTools.isPrime(7);
        System.out.println(prime);
        boolean prime1 = ArithmeticTools.isPrime1(7);
        System.out.println(prime1);


    }
}
