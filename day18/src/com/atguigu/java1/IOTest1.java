package com.atguigu.java1;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author oono
 * @date 2020 09 14
 */
public class IOTest1 {

    public static void main(String[] args) throws IOException {

        //创建文件字节流输入对象
        FileInputStream fis = new FileInputStream("d:/hello1.txt");

        //读取数据
        //读一个字节
        int read = fis.read();
        System.out.println(read);//97
//        read = fis.read();
        System.out.println((char)read);//a

        //用循环读取一个一个的字节，没有数据会返回-1，可作为终止条件呢
        int by = -1;
        while((by = fis.read()) != -1){
            System.out.print((char)by);
        }

        //关闭流
        fis.close();

    }

}
