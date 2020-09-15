package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @author oono
 * @date 2020 09 15
 */
public class BufferedStreamsTest {

    public static void main(String[] args) throws IOException {

        //创建一个字节输出流
        FileOutputStream fos = new FileOutputStream("test1.txt",true);

        //创建一个装饰器：缓冲字节流（又叫高效字节流）
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //写出数据
        bos.write(97);

        bos.write("hello bufferedOutputStream".getBytes());

        //关闭流
        bos.close();

    }

    @Test
    public void test2() throws IOException{

        //创建一个缓冲字节流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\dev\\workspace\\workspace_idea1\\JavaSE/test1.txt"));

        //读取数据
        byte[] bytes = new byte[1024];
        int length = 0;
        while((length = bis.read(bytes)) != -1){
            System.out.println(new String(bytes));
//            System.out.println(String.valueOf(bytes));
        }

        bis.close();

    }

    @Test
    public void test3(){

        byte[] bytes = {65,77};
        String s = String.valueOf(bytes);
        System.out.println(s);

        String s10 = new String(bytes);
        System.out.println(s10);

        String s1 = new String(bytes);
        System.out.println(s1);
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream());

        char[] chars = {65,97};
        String s2 = String.valueOf(chars);
        System.out.println(s2);

        int[] ints = {65,97};
        String s3 = String.valueOf(ints);
        System.out.println(s3);
//        System.out.println(ints);


    }

}
