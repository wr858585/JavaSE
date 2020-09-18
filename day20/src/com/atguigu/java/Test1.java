package com.atguigu.java;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author oono
 * @date 2020 09 16
 */
public class Test1 extends Super implements Inter{

    @Test
    public void test100(){

        String str = "aabbccdd";
        String target = "bb";
        String replace = "dd";

        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb1 = new StringBuilder(str);

        while(sb.indexOf(target) != -1){
            int index = sb.indexOf(target);
            StringBuilder delete = sb.delete(index, index + target.length());
            StringBuilder append = delete.append(replace);
            sb1 = append;
        }

        String s = sb1.toString();
        System.out.println(s);


    }

    @Test
    public void test24(){
        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("大野","杉山"));
        System.out.println(list1);
    }


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