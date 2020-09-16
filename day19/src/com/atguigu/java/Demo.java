package com.atguigu.java;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import jdk.internal.util.xml.impl.Input;
import org.junit.Test;

import java.io.*;

/**
 * @author oono
 * @date 2020 09 15
 */
public class Demo {

    @Test
    public void test1() throws IOException {

        FileReader fr = new FileReader("test1.txt");

        int ch = fr.read();
        System.out.println((char)ch);

        fr.close();

    }

    @Test
    public void test2() throws IOException{

        BufferedWriter bw = new BufferedWriter(new FileWriter(""));
//        BufferedOutputStream bos = new BufferedOutputStream(new OutputStream(""));

        //转换流InputStreamReader和OutputStreamWriter，
        InputStreamReader isr = new InputStreamReader(new FileInputStream("test1.txt"), "GBK");

        int ch = isr.read();
        System.out.println((char)ch);

        isr.close();

    }

    @Test
    public void test3() throws IOException{

        InputStreamReader isr = new InputStreamReader(new FileInputStream("test1.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test1_copy.txt"),"UTF-8");



        byte[] bytes = new byte[1024];
        int length;
//        while(length = isr.read())

    }
}
