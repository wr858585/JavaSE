package com.atguigu.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 2. 使用字节流复制文件，一次读写一个字节数组
 * @author oono
 * @date 2020 09 14
 */
public class Question2 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("d:/尚硅谷JavaSE阶段考试题库.pdf");
        FileOutputStream fos = new FileOutputStream("d:/尚硅谷JavaSE阶段考试题库_复制件2.pdf");

        int readLength = 0;
        byte[] bytes = new byte[1024];

        while((readLength = fis.read(bytes)) != -1){
            fos.write(bytes,0,readLength);
        }

        fis.close();
        fos.close();

    }

}
