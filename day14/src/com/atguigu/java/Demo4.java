package com.atguigu.java;

import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * DateTimeFormatter类
 *
 * @author oono
 * @date 2020 09 09
 */
public class Demo4 {

    public static void main(String[] args) {

        //格式化

        //创建日期时间类对象
        LocalDateTime now = LocalDateTime.now();

        //创建格式化对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd日：hh时mm分ss秒");

        //格式化
        String format = dtf.format(now);
        System.out.println(format);//2020-09-09日：11时41分02秒

        System.out.println("---------------------");

        //解析

        LocalDate parse = LocalDate.parse(format, dtf);
        System.out.println(parse);//2020-09-09                                                

        //TemporalAccessor是一个其他接口，不用
//        TemporalAccessor parse1 = dtf.parse(format);
//        java.util.Date date = (java.util.Date)parse;

    }


}
