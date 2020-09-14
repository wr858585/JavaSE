package com.atguigu.java1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流
 * 1. 输入/输出 流，均是针对内存来说的，对内存来说是输出的 -> 输出流；对内存来说是输入的 -> 输入流
 * 2. FileWriter类，可以写入char,char[],String等，但是不能写FileOutputStream写的byte,byte[]!
 * 3. FileReader类，可以读取char,char[],String等
 * @author oono
 * @date 2020 09 14
 */
public class IOTest4 {

    public static void main(String[] args) throws IOException {

        //创建一个文件字符输出流
        FileWriter fw = new FileWriter("d:/hello2.txt", false);
        //创建一个文件字符输入流
        FileReader fr = new FileReader("d:/hello1.txt");

/*
        //读取数据
        int read = fr.read();//读取一个字符
        System.out.println((char)read);//A
        //把数据读取到指定数组中，返回值是读取的长度！！
        char[] chars = new char[4];
        int readLength = fr.read(chars);
        System.out.println(chars);//同学：
        System.out.println(readLength);//3（因为只剩三个字符了）
*/

        //循环读取，一次读一个字符char
/*
        int ch = -1;

        while((ch = fr.read()) != -1){
            System.out.println((char)ch);
        }
*/

        //循环读取，一次读指定长度的字符数组char[]
        char[] chars = new char[3];
        int len = 0;
        while((len = fr.read(chars)) != -1){
            System.out.print(new String(chars,0,len));
        }
        
        //写入数据
        fw.write('A');//可以写一个字符
        fw.write(new char[]{'B', 'C'});//可以写一个字符数组
        fw.write("同学：");//可以写一个字符串

        fw.close();
        fr.close();



    }

}
