package com.atguigu.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Stream的终止操作
 * 1. 执行种植操作后不能再继续操作这个stream
 * @author oono
 * @date 2020 09 21
 */
public class StreamFinalTest {

    @Test
    public void test1(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }

    @Test
    public void test(){



        List<Integer> list = Arrays.asList(12,3,2,56,1);

        //1. 检查是否匹配所有元素
        boolean b = list.stream().allMatch(e -> e > 10);//只能返回boolean了！不能再进行链式编程！所以是一个种植操作

        //2. 检查是否有一个匹配的元素
        boolean b1 = list.stream().anyMatch(e -> e > 10);

        //3. 检查是否没有一个匹配
        boolean b2 = list.stream().noneMatch(e -> e > 10);

        //4. 返回第一个元素
        Optional<Integer> first = list.stream().findFirst();
        System.out.println(first);//Optional[12]

        //5. 返回当前流的任意元素
        Optional<Integer> any = list.stream().findAny();
        System.out.println(any);
        
    }

}
