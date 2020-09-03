package com.atguigu.java1;

/**
 * 方法的重载
 * @author oono
 * @date 2020 08 31
 */
public class Demo5 {

    public static void main(String[] args) {
        int add = add('5', '2');
        System.out.println(add);//103
        add("hello",1);//hello1
    }

    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static int add(int ...a){
        int sum = 0;
        for(int num : a){
            sum += num;
        }
        return sum;
    }
    public static int add(char a, char b){
        return a + b;
    }
    public static void add(String s, int a){
        System.out.println(s + a);
    }
    public static void add(int a, String s){
        System.out.println(a + s);
    }

}
