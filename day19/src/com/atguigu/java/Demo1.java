package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * 数据流
 * @author oono
 * @date 2020 09 15
 */
public class Demo1 {

    @Test
    public void test1() throws IOException {

        byte b = 11;
        int a = 10;
        long c = 12;
        char d = 'c';
        boolean e = false;
        String s = "hello";

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));

        dos.writeByte(b);
        dos.writeInt(a);
        dos.writeLong(c);
        dos.writeChar(d);
        dos.writeBoolean(e);
        //dos.writeUTF(String str)是写出一个String
        dos.writeUTF(s);

        dos.close();
    }

    @Test
    public void test2() throws IOException{

        DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));

        //必须严格按照写出的数据类型的顺序一个一个读，否则乱码

        byte b = dis.readByte();
        System.out.println(b);

        int read = dis.read();
        System.out.println(read);

        long l = dis.readLong();
        System.out.println(l);//???????????????报错

        char c = dis.readChar();
        System.out.println(c);

        boolean b1 = dis.readBoolean();
        System.out.println(b1);

        String s = dis.readUTF();
        System.out.println(s);

    }

}
