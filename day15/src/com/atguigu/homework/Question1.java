package com.atguigu.homework;

import java.util.*;

/**
 * 1、用一个String[]数组存点数
 2、用一个String[]数组存花色
 3、用一个String[]数组存大王、小王
 4、用上面的数组，生成一副扑克牌，放到Collection的集合中
 5、遍历显示全副扑克牌
 6、模拟给4个人随机发牌，每个人11张牌，分别放到四个Collection集合中
 7、显示每个人的牌和剩余的牌
 * @author oono
 * @date 2020 09 11
 */
public class Question1 {

    public static void main(String[] args) {

        String[] nums = {"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] shapes = {"黑桃","红桃","梅花","方块"};
        String[] jokers = {"大王","小王"};

        Set<String> poker = new HashSet<>();

        for (int i = 0; i < shapes.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                poker.add(shapes[i] + nums[j]);
            }
        }

        poker.add(jokers[0]);
        poker.add(jokers[1]);

        System.out.println("全部的扑克牌：");
        System.out.println(poker);//无序

        System.out.println("发牌");

        Set<String> hand1 = new HashSet<>();
        Set<String> hand2 = new HashSet<>();
        Set<String> hand3 = new HashSet<>();
        Set<String> hand4 = new HashSet<>();

        for (int i = 0; i < poker.size(); i++) {
//            poker.remove()
        }



    }

}
