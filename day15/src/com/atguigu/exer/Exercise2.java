package com.atguigu.exer;

import com.atguigu.java1.ArrayListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 随机获取10个100以内的偶数，存入list，遍历之
 * @author oono
 * @date 2020 09 11
 */
public class Exercise2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (; list.size() < 10;) {
//            Integer randomNum = (int)(Math.random() * (100 - 0 + 1) + 0);
            int randomNum = new Random().nextInt(100);
            if(randomNum % 2 == 0){
                list.add(randomNum);
            }
        }

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }

        System.out.println();

        for (Integer integer : list) {
            System.out.print(integer + "\t");
        }

        System.out.println( );

        System.out.println(list);


    }

}
