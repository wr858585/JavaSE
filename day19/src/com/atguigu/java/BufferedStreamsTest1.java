package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * 字符缓冲流：BufferedReader, BufferedWriter
 * @author oono
 * @date 2020 09 15
 */
public class BufferedStreamsTest1 {

    @Test
    public void test1() throws IOException {

        BufferedWriter  bw = new BufferedWriter(new FileWriter("bw.txt"));

        bw.write('c');

        //字符流特有的方法!!!!!!
        bw.newLine();

        bw.write("hello kal;jsdlk;fj;laksdjflkjuelk".toCharArray());

        //缓冲字符流特有的方法！！！！！把缓存中的数据全部冲走，到要写出的文件中
        //如果流没有关闭，则只会把flush前的数据写出，之后仍在缓冲区中。
        //所以，如果没有close，也没有flush，则所有数据都存在缓冲区中，当缓冲区存满了才会一次性写入文件当中
        bw.flush();

        bw.write("sldkjflk;sdajflkadsjfk");

        //close的时候也会把所有剩下的数据冲走
        //关闭流的时候会同时刷新缓存区，所以不会数据丢失
        bw.close();
    }

    @Test
    public void test2() throws IOException{

        BufferedReader br = new BufferedReader(new FileReader("bw.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("copy.txt"));

        String line = null;

        //当读取的一行有内容的时候（非null），继续读取
        while((line = br.readLine()) != null){
            //每次读取一行
            bw.write(line);
            //bw.flush()操作：刷新缓存区！读一行就写一行（有实际意义）
            bw.flush();
            //另起一行再写入
            bw.newLine();
        }



    }

}
