package com.atguigu.java1;

/**
 * @author oono
 * @date 2020 08 31
 */
public class Demo {

    public static void main(String[] args) {

        int a = 10;
        int b = 11;

        swap(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int result = add(10,20,30,40);
        System.out.println(result);//

        calc("*",1,2,3);

    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    //根据符号运算值
    public static void calc(String s, int ...num){
        //可变参数一定在参数列表的最后位置，py可以别弄混了

        switch(s){
            case "+":
                int sum = 0;
                for (int i = 0; i < num.length; i++) {
                    sum += num[i];
                }
                System.out.println(sum);
                break;
            case "*":
                int mul = 0;
                for (int i = 0; i < num.length; i++) {
                    mul *= num[i];
                    System.out.println(mul);
                    break;
                }
        }


    }

    //可变参数
    public static int add(int ...a){
        System.out.println(a);//[I@1540e19d，可变形参底层是一个数组
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }




}
