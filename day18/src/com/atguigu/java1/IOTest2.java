package com.atguigu.java1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author oono
 * @date 2020 09 14
 */
public class IOTest2 {

    public static void main(String[] args) throws IOException {

        //创建文件字节输入流
        FileInputStream fis = new FileInputStream("d:/hello1.txt");

        //读取数据
        byte[] arr = new byte[10];
        int len = fis.read(arr);
        System.out.println(len);//10：返回值是读取的数据长度
        System.out.println(arr);//[B@1540e19d：读到的数据装进形参中

        //查看读到的数据
        for (int i = 0; i < arr.length; i++) {
            System.out.println((char)arr[i]);
        }

        fis.close();

    }

}
