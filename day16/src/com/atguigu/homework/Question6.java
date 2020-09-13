package com.atguigu.homework;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 案例：键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。例如输入：
 * aaaabbbcccddd，打印结果为：abcd。
 * @author oono
 * @date 2020 09 12
 */
public class Question6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");

        String next = sc.next();
        char[] chars = next.toCharArray();

        Set<Character> set = new LinkedHashSet();
        for (Character e : chars){
            set.add(e);
        }

        for (Character character : set) {
            System.out.print(character + "\t");
        }



    }
}
