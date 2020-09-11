package com.atguigu.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * 随机生成30个数，范围2-100，获取其中的质数。
 * @author oono
 * @date 2020 09 11
 */
public class Question4 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            nums.add((int)(Math.random() * (100 - 2 + 1) + 2));
        }

        System.out.println("随机数为：");
        System.out.println(nums);

        List<Integer> primeNums = new ArrayList<>();
        boolean isPrime = true;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 2; j <= Math.sqrt(nums.get(i)); j++) {
                if(nums.get(i) % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNums.add(nums.get(i));
            }
            isPrime = true;
        }

        System.out.println(primeNums);



    }

}
