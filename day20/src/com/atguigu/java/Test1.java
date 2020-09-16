package com.atguigu.java;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author oono
 * @date 2020 09 16
 */
public class Test1 extends Super implements Inter{

    @Test
    public void test6(){

//        float f = 1.5;
        float f = 1.5f;
    }

    @Test
    public void test14(){

        int a = 3;
        int b = 5;
//        if(a = b){//
           //
        }//

    public static int daysOfYear(int year, int month, int day){

        LocalDate ld = LocalDate.of(year,month,day);
        int dayOfYear = ld.getDayOfYear();
        System.out.println(dayOfYear);

        return dayOfYear;
    }

    @Test
    public void test26() {


        daysOfYear(1991,4,29);

        LocalDate ld = LocalDate.of(1991,4,29);
        System.out.println(ld);
        System.out.println(ld.getDayOfYear());

//        LocalDateTime ldt = new LocalDateTime("yyyy-MM-dd HH:mm:ss");

        String str = "1991-04-29";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


    }

    public static void main(String[] args) {

        Test1 test1 = new Test1();

//        System.out.println(i);

    }
}

class Super{

    int i = 1;
}

interface Inter{

    int i = 1;
}