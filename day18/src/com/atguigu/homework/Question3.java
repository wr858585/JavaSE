package com.atguigu.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 3. 使用字符流复制文本文件，一次读写一个字符
 * @author oono
 * @date 2020 09 14
 */
public class Question3 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("d:/hello1.txt");
        FileWriter fw = new FileWriter("d:/hello1_复制件20.txt");

        int length = 0;
        char[] chars = new char[3];
        while((length = fr.read(chars)) != -1){
            fw.write(chars,0,length);
        }

        fr.close();
        fw.close();

    }

}
