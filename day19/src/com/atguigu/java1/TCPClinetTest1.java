package com.atguigu.java1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author oono
 * @date 2020 09 15
 */
public class TCPClinetTest1 {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",1008);

        OutputStream os = socket.getOutputStream();

        os.write("快点下班".getBytes());

        os.close();

    }

}
