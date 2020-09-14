package com.atguigu.exer;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author oono
 * @date 2020 09 13
 */
public class Exer5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, BigInteger> map = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("请输入组员" + (i + 1) + "的名字：");
            String name = sc.next();
            System.out.println("请输入组员" + (i + 1) + "的电话：");
            BigInteger phone = sc.nextBigInteger();
            map.put(name,phone);
        }

//        System.out.println(map);

        for (String s : map.keySet()) {
            BigInteger value = map.get(s);
            System.out.println(s + "的电话：" + value);
        }

        System.out.println("----------");

        System.out.println("请输入你要查询的组员名字：");
        String name = sc.next();

        System.out.println(name + "的电话是：" + map.get(name));

    }

}
