package com.atguigu.exer1;

import java.util.Scanner;

/**
 * @author oono
 * @date 2020 09 09
 */
public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入星期几（1-7)：");

        String value = sc.nextLine();

        Weekday weekday = Weekday.getWeekdayByValue(Integer.valueOf(value));

        System.out.println(weekday);

    }

}
