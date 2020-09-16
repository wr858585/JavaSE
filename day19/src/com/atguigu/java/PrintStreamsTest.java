package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * 打印流（只有PrintStream输出流一个！）
 *
 * @author oono
 * @date 2020 09 15
 */
public class PrintStreamsTest {

    @Test
    public void test() throws FileNotFoundException {

        //打印字节流PrintStream
        PrintStream ps = new PrintStream(new FileOutputStream("ps.txt"));

        //两种方法，write传统方法，print/println新方法，可以写任何数据很方便
        //write传的是byte,byte[]
        ps.write(97);
        ps.println("啦啦啦啦不是狗狗狗古狗狗狗");

        ps.close();
    }

    @Test
    public void test1() throws IOException {

        //打印字符流PrintWriter
        PrintWriter pw = new PrintWriter(new FileOutputStream("ps2.txt"));

        //write传的是char,char[],String
        pw.write(97);
        pw.print(98987.1);
        pw.println("啊啊啊啊啊");

        //out,in都是System类中定义的自定义类的属性，类是PrintWriter/PrintStream。
        //所以，System.out相当于是System类中的一个实例对象，自然可以调自定义类PrintStream类中的print()/println()方法
        System.out.println();

        //所以，print(),println()其实是打印流里的方法！！



    }


}
