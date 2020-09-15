package com.atguigu.java1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author oono
 * @date 2020 09 15
 */
public class TCPServerTest1 {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(7777);

        Socket accept = ss.accept();

        InputStream is = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);

        System.out.println(new String(bytes));



//        while((len = is.read(bytes)) != -1){
//            is.read(bytes,0,len);
//        }

        //获取对方的ip地址
        String ip = accept.getInetAddress().getHostAddress();

        //显示对方发送的信息
        System.out.println(ip + ":" + new String(bytes));

        is.close();
        ss.close();
        accept.close();
    }

}
