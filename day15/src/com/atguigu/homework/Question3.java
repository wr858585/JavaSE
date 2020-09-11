package com.atguigu.homework;

import org.junit.Test;

import java.util.*;

/**
 * 问题三
 * 1、随机生成10个[1,100]之间的整数，放到List集合中，遍历显示
 * 2、找出前3名最大值，删除它们，注意可能重复
 * 3、显示删除后的结果
 * @author oono
 * @date 2020 09 11
 */
public class Question3 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add((int)(Math.random() * (100 + 1) + 1));
        }

        nums.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer int1, Integer int2){
                return int1.compareTo(int2);
            }
        });

        System.out.println("10个随机数：");
        System.out.println(nums);

/*
        for (Integer num : nums) {
            System.out.print(num);
        }
*/

        List<Integer> removals = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Integer remove = nums.remove(nums.size() - 1);
            removals.add(remove);
        }

        System.out.println(Collections.max(nums));

        System.out.println("前三个最大的数：");
        System.out.println(removals);

        System.out.println("删除后：");
        System.out.println(nums);
/*
        Iterator iterator = nums.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
*/

    }

    @Test
    public void test(){

        List list = new ArrayList();
        list.add(10);

        list.remove((Integer)10);

    }
}