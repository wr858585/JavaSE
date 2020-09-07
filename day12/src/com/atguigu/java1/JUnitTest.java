package com.atguigu.java1;

import org.junit.Test;

/**
 * @author oono
 * @date 2020 09 07
 */
public class JUnitTest {

    @Test
    public void test1(){
        test();
    }

    @Test
    public void test2(){
        testAgain();
    }

    public void test(){
        System.out.println("hello junit");
    }

    public void testAgain(){
        System.out.println("hello again");
    }


}
