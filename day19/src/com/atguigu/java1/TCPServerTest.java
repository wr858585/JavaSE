package com.atguigu.java1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author oono
 * @date 2020 09 15
 */
public class TCPServerTest {

    public static void main(String[] args) throws IOException {

        System.out.println("服务器端启动了，等待接收数据");

        //1. 创建一个服务端ServerSocket对象
        ServerSocket ss = new ServerSocket(1234);

        //2. 接收一个socket（是一个阻塞方法）
        Socket accept = ss.accept();

        //3. 获取输入流
        InputStream is = accept.getInputStream();

        //4. 读取数据
        byte[] bytes = new byte[1024];
        int length = is.read(bytes);
        System.out.println(new String(bytes,0,length));
//        is.close();

        //4.5 反馈信息，获取输出流
        OutputStream os = accept.getOutputStream();
        os.write("收到".getBytes());


        //5. socket可以不关，流还是要关（这里都关了）
        accept.close();
        ss.close();


    }

}
