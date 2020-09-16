package com.atguigu.java1;

import com.sun.security.ntlm.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
    @author oono
    @date 2020 09 15
*/
public class UploadServerTest {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(6523);

        //接收socket对象
        Socket accept = ss.accept();

        //获取输入流，用于读取socket发送的数据
        InputStream is = accept.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);

        //创建输出流，用于写入文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/ii.txt"));

        //读写数据
        byte[] bytes = new byte[1024];
        int len = -1;
        while((len = bis.read(bytes)) != -1){
//            bis.read(bytes,0,len);
            bos.write(bytes,0,len);
        }

        //释放资源
        bis.close();
        bos.close();


    }

}
