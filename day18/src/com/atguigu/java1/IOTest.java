package com.atguigu.java1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IOStreams
 * 1. 按IO流向分：
 * ① 输入流：硬盘-->内存
 *    输出流：内存-->硬盘
 * ② OutputStream类（把系统中的数据写入文件中）
 * 1> 抽象类，字节流，是所有输出字节流的父类
 * 2> 我们用其子类，FileOutputStream子类，用于向文件中写入数据（系统的数据流向文件）
 *      构造器：new FileOutputStream(File file)
 *      [如果file不存在，则会自动创建该文件]
 *      方法：write(byte b)
 *          write(byte[] arr)
 *          write(byte[] arr, int off, int len)
 * 3> 以上为覆盖操作，不会每次都在后面追加写入append
 *      构造器：new FileOutputStream(File file, boolean appendable)
 *      第二个参数默认为false，如果改成true，则会每次执行命令都会在后面append此文件，而不会starting from scratch
 * ③ InputStream类（把文件数据写入系统中）
 * 1> 抽象类，字节流，是所有输入字节流的父类
 * 2> 我们用其子类，FileInputStream子类，用于从文件中读出输入（文件的数据流向系统）
 * 3> 同FileOutputStream有所不同，FileInputStream的实例如果文件没有，自然不会自动创建，反而会报FileNotFoundException
 * 4> read()：每次只读取一个字节
 *    read(byte[] arr)，会把读取到的数据返回到arr形参中，返回值则是读取的数据的长度
 * 2. 按IO操作的数类分：
 * 字节流：数据以byte为单位传输
 * 字符流：数据以char为单位传输
 * 3. 字符输入流和字符输出流
 * ① 根父类Writer抽象类
 * ② 我们用子类FileWriter类
 * @author oono
 * @date 2020 09 14
 */
public class IOTest {

    public static void main(String[] args) throws IOException {

        //新建一个file文件
        File file = new File("d:/test.txt");
        if(!file.exists()) {
            boolean create = file.createNewFile();
        }

        //创建一个向指定File对象的写入文件/将数据流向文件中的文件输出流
        //创建一个字节输出流
        FileOutputStream fos = new FileOutputStream(file);
        //写数据，形参为byte类，将数据写到流中，从而流向文件file中
        fos.write(97);
        fos.write(98);
        fos.write(99);
        //释放资源（当对此文件对象的操作结束时，需要把任何输入/输出流断掉，让RAM系统资源不再有任何和它的关系造成资源占用和浪费）

        byte[] bytes = {100,101,102,103};
        fos.write(bytes);

        fos.write(bytes,0,2);

        fos.close();

        //创建一个文件字节输出流
        //如果没有此文件，则FileOutputStream会自动创建该文件
        FileOutputStream fos1 = new FileOutputStream("d:/hello1.txt",true);
        fos1.write(97);

        //写入换行符
        //windows OS中，换行是\r\n，但是write(byte[] bytes)，所以要转换成byte数组，用String.getBytes()
        fos1.write("\r\n".getBytes());

        fos1.write(98);

        fos1.write("\n今天学IO流了哦啊啊啊啊啊啊啊\n开心吗哈哈哈\n".getBytes());

        fos1.close();

    }

}
