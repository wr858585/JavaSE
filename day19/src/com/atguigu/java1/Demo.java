package com.atguigu.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author oono
 * @date 2020 09 15
 */
public class Demo {

    public static void main(String[] args) throws UnknownHostException {

        //获取主机名
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//DESKTOP-IIURFUF/192.168.19.76

        //
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        System.out.println(byName);///127.0.0.1

//        InetAddress byName1 = InetAddress.getByName()



    }

}
