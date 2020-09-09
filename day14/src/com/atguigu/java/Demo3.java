package com.atguigu.java;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author oono
 * @date 2020 09 09
 */
public class Demo3 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("now = " + now);//now = 2020-09-08T23:13:19.865

        LocalDateTime now1 = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("now1 = " + now1);//now1 = 2020-09-09T11:14:16.765




    }

}
