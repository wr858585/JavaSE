package com.atguigu.java1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP协议的特点：
 * 1. 非面向连接的，不可靠的/不安全的 --> 效率高
 * 2. 一次可以发送的数据量有限，为64kb
 * @author oono
 * @date 2020 09 15
 */
public class UDPServerTest {

    public static void main(String[] args) throws IOException {

        System.out.println("等待接收");

        //创建服务端socket对象，且指定此服务器要使用的端口
        DatagramSocket ds = new DatagramSocket(9999);

        //创建一个DatagramPacket用于接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //接收一个包裹
        ds.receive(dp);

        //拆开包裹，解析数据
        InetAddress ip = dp.getAddress();//对方ip
        byte[] data = dp.getData();//数据
        int length = dp.getLength();//数据长度

        //输出数据到控制台
        System.out.println("来自IP:" + ip.getHostAddress());
        System.out.println(new String(data,0,length));

        //释放资源
        ds.close();



    }

}
