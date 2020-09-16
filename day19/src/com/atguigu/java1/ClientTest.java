package com.atguigu.java1;

import java.io.*;
import java.net.Socket;

/**
 * @author oono
 * @date 2020 09 15
 */
public class ClientTest {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("192.168.19.76",6523);

        //获取输出流，用于写入数据
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        //创建一个输入流，用于读取文件数据
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/hello1.txt"));

        //读写数据
        byte[] bytes = new byte[1024];
        int len = -1;
        while((len = bis.read(bytes)) != -1){
//            bis.read(bytes,0,len);
            bos.write(bytes,0,len);
//            System.out.println(new String(bytes));
        }



        bis.close();
        bos.close();
        socket.close();




    }

}
