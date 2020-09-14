package com.atguigu.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 1. 使用字节流复制一个文件，一次读写一个字节
 * @author oono
 * @date 2020 09 14
 */
public class Question1 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("d:/尚硅谷JavaSE阶段考试题库.pdf");
        FileOutputStream fos = new FileOutputStream("d:/尚硅谷JavaSE阶段考试题库_复制件.pdf");

        int bt = 0;
        while((bt = fis.read()) != -1){
            fos.write(bt);
        }

        fis.close();
        fos.close();
        
    }

}
