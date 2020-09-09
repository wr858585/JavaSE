package com.atguigu.java;

import java.util.Date;

/**
 * Date类
 * @author oono
 * @date 2020 09 09
 */
public class Demo {

    public static void main(String[] args) {

        Date d = new Date();

        System.out.println("d = " + d);//d = Wed Sep 09 09:47:30 CST 2020

        d.getTime();

    }

}
