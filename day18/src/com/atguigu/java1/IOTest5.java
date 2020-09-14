package com.atguigu.java1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流读中文：必须要三个为最小长度来读取，因为一个中文占3个字节，读一个中文的1个byte，则一定会弄成其他乱码
 * @author oono
 * @date 2020 09 14
 */
public class IOTest5 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("d:/hello1.txt");
        FileOutputStream fos = new FileOutputStream("d:/hello1_copy.txt");

        int ch = 0;
        byte bt = 0;
//        byte[] bytes = new byte[3];
        while((ch = fis.read()) != -1){
//            int read = fis.read(bytes);
//            System.out.println((char)ch);//
            fos.write(ch);
        }

        fis.close();
        fos.close();

    }

}
