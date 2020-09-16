package com.atguigu.java1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 用TCP编写一个客户端
 * @author oono
 * @date 2020 09 15
 */
public class TCPClientTest {

    public static void main(String[] args) throws IOException {

        //1. 创建一个客户端ClientSocket对象，构造器中写ip地址（往什么地方发数据：host，port）
        Socket socket = new Socket("127.0.0.1",7777);

        //2. 获取输出流
        OutputStream os = socket.getOutputStream();

        //3. 写入数据
        os.write("hello tcp".getBytes());

        //4. 关流
//        os.close();

        //4.5 接收反馈
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = is.read(bytes)) != -1){
            is.read(bytes,0,len);
        }
        System.out.println(new String(bytes));

        is.close();

        //5. 关闭socket
        socket.close();

    }

}
