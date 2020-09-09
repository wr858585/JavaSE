package com.atguigu.java;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar类
 * 1. 是一个抽象类，只能通过静态方法getInstance()方法来获取实例（这是用其实现类，但是不推荐，很难记名字）
 * @author oono
 * @date 2020 09 09
 */
public class Demo1 {

    public static void main(String[] args) {

        //获取Calendar对象
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.DATE);
        System.out.println(calendar.MONTH);
        System.out.println(calendar.YEAR);
        System.out.println(calendar.DAY_OF_WEEK);
        System.out.println(calendar.DAY_OF_MONTH);
        System.out.println(calendar.DAY_OF_YEAR);
        System.out.println(calendar.WEEK_OF_MONTH);
        System.out.println(calendar.WEEK_OF_YEAR);

    }

}
