package com.atguigu.java1;

import java.io.File;
import java.io.IOException;

/**
 * File类
 * 1. 文件和目录名的抽象表示形式，表示文件/文件夹的目录path，而不是文件/文件夹内容本身
 * 2. 磁盘上存的只有两种东西：文件和文件夹
 * 3. 通过File类调用系统资源，对文件进行增删改查，需要throws IOException
 *
 * @author oono
 * @date 2020 09 14
 */
public class FileClassTest {

    public static void main(String[] args) throws IOException {

        //构造器一：new File(String pathname)
        File file = new File("D:/demo.java");

        String name = file.getName();
        System.out.println(name);//demo.java

        boolean isExist = file.exists();
        System.out.println(isExist);//false

        //构造器二：new File(String parent, String child)
        //parent文件夹，child文件
        File file1 = new File("D:/hello","Demo.tax");
        File file2 = new File("D:\\hello","Demo.tax");

        //描述一个文件夹
        File file3 = new File("D:/hello");
        System.out.println(file3.exists());//false

        //描述一个文件夹下的文件
        File file4 = new File(file3, "Demo.txt");

        //通过程序来创建一个文件
        File file5 = new File("d:/hello.txt");
        boolean newFile = file5.createNewFile();
        System.out.println(newFile);//true

        //通过程序来删除一个文件
        boolean delete = file5.delete();
        System.out.println(delete);//true
        boolean delete1 = file5.delete();
        System.out.println(delete1);//false

    }

}
