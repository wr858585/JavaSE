package com.atguigu.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * SimpleDateFormat类、LocalDateTime类
 * @author oono
 * @date 2020 09 09
 */
public class Demo2 {

    /*
    需求：把2020-10-1转化为日期类对象；再转回一个对象
     */

    public static void main(String[] args) throws ParseException {

        String str = "2009/10/22";

        //解析：String --> Date类或其他类的实例对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date parse = sdf.parse(str);
        System.out.println("parse = " + parse);//parse = Thu Oct 22 00:00:00 CST 2009

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(dtf.parse(str));//{},ISO resolved to 2009-10-22

        //格式化：Date等类的日期实例 --> String
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);//now = 2020-09-09T10:23:32.135
        String str1 = dtf.format(now);
        System.out.println("str1 = " + str1);//str1 = 2020/09/09

        LocalDate date = LocalDate.now();
        System.out.println("date = " + date);//date = 2020-09-09
        System.out.println(date.getMonth());//SEPTEMBER
        System.out.println(date.getMonthValue());//9
        System.out.println(date.getYear());//2020
        System.out.println(date.getDayOfWeek());//WEDNESDAY
        System.out.println(date.getDayOfMonth());//9
        System.out.println(date.getDayOfYear());//253
        System.out.println("----------");

        LocalDate date1 = LocalDate.of(2020,9,10);
        System.out.println(date1.getDayOfWeek());//THURSDAY
        System.out.println(date1.getDayOfWeek().getValue());//4

        LocalDate localDate = date1.minusYears(1);
        System.out.println("localDate = " + localDate);//localDate = 2019-09-10

        LocalDate localDate1 = localDate.plusMonths(2);
        System.out.println("localDate1 = " + localDate1);//localDate1 = 2019-11-10

        LocalDateTime time = LocalDateTime.of(2020,9,11,16,6);
        System.out.println("time = " + time);//time = 2020-09-11T16:06




    }

}
