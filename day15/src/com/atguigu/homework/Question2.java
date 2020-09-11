package com.atguigu.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 模拟乐透号码。
 * 随机生成10个号码放到集合中，范围1-50，作为乐透号码。不能重复。
 * 键盘录入10个整数放到集合中，范围1-50，不能重复。
 * 录入的整数与乐透号码对比，统计猜中了几个。
 * @author oono
 * @date 2020 09 11
 */
public class Question2 {

    public static void main(String[] args) {

        List<Integer> lottoNums = new ArrayList<>();
        List<Integer> myNums = new ArrayList<>();

        //本期乐透号码
        for (int i = 0; lottoNums.size() < 10; i++) {
            int add = (int) (Math.random() * (50 - 1 + 1) + 1);
            if(!lottoNums.contains(add)){
                lottoNums.add(add);
            }
        }

        //你的号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            boolean flag = true;
            do {
                System.out.println("请输入你的第" + (i + 1) + "个号码：");
                int add = sc.nextInt();
                if (myNums.contains(add)) {
                    System.out.println("输入的号码不可重复，请重新输入哦：");
                }else if(add < 0 || add > 50){
                    System.out.println("请输入0-50之间的号码");
                }else{
                    myNums.add(add);
                    flag = false;
                }
            }while(flag);
        }

        System.out.println("本期中奖号码：" + lottoNums);
        System.out.println("你挑选的号码：" + myNums);
        lottoNums.retainAll(myNums);
        System.out.println("你猜中了" + lottoNums.size() + "个号码");

    }
}