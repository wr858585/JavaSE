package com.atguigu.exer;

/**
 *
 * @author oono
 * @date 2020 08 26
 */
public class Test2 {
    public static void main(String[] args) {
        char[] characters = {'a','b','c','d','e','f','g'};
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i] + "-->" + (char)(characters[i] - 32));
        }
    }
}
