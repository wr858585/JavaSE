package com.atguigu.java;

import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

/**
 * @author oono
 * @date 2020 09 13
 */
public class PropertiesTest {

    public static void main(String[] args) {

        Properties prop = new Properties();
        prop.setProperty("id","1001");
        prop.setProperty("user","tom");
        prop.setProperty("password","123");

        Set keys = prop.keySet();
        for (Object key : keys) {
            //根据key获取value
            String value = prop.getProperty((String)key);
            System.out.println(key + "=" + value);
        }

//        prop.store(new FileWriter(("1.txt"),""));



    }

}
