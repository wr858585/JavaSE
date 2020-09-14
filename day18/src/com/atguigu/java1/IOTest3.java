package com.atguigu.java1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流的应用：复制一个文件
 * @author oono
 * @date 2020 09 14
 */
public class IOTest3 {

    public static void main(String[] args) throws IOException {

        //创建一个文件输入流
        FileInputStream fis = new FileInputStream("d:/hello1.txt");

        //创建一个文件输出流（一次读写一个字节）
        FileOutputStream fos = new FileOutputStream("d:/hello1_copy2.txt");

        //创建一个文件输出流（一次读写一个字节数组）


        //读写操作1：一次读写一个byte
        int len = -1;
//        while((ch = fis.read()) != -1){
//            //写一个字节到文件中
//            fos.write(ch);
//        }

        //读写操作2：一次读写一个byte[]，长度可以自定义
        //要防止最后一次读取的时候，还未读完，数据就已经没有了，这时写入仍然需要写入数据，则剩下的数据是错的
        //solution：运用read(byte[] arr)的返回值是arr.length的特性，把write传入这个参数，让每次写入arr长度的字节数组write(byte[] arr, int offset, int length)
        byte[] bys = new byte[50];
        while((len = (fis.read(bys))) != -1){
            fos.write(bys,0, len);
        }

        //关闭流
        fis.close();
        fos.close();


    }

}
