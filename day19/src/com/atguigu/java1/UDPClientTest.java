package com.atguigu.java1;

import java.io.IOException;
import java.net.*;

/**
 * @author oono
 * @date 2020 09 15
 */
public class UDPClientTest {

    public static void main(String[] args) throws IOException {

        //客户端socket对象创建
        DatagramSocket ds = new DatagramSocket();

        //把发送的数据打包
        byte[] bytes = "hello.udp".getBytes();//要发送的数据
        InetAddress ip = InetAddress.getByName("127.0.0.1");//对方ip
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,ip,9999);
        //发送
        ds.send(dp);

        //释放资源
        ds.close();

    }

}
