package com.atguigu.exer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author oono
 * @date 2020 09 11
 */
public class Exercise1 {

    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<>();

        boolean isPrime = true;

        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                list.add(i);
            }

            //还原isPrime
            isPrime = true;
        }

        //遍历集合方式一：增强for遍历
        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println("-------------------------------------------");

        //遍历集合方式二：iterator，并删除个位数是3的数
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.hasNext();
            if((Integer)obj % 10 == 3){
                iterator.remove();
            }
            System.out.println(obj);
        }


    }



}
