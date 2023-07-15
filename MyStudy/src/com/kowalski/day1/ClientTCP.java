package com.kowalski.day1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",6666);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好服务器，我是客户端".getBytes());

        InputStream inputStream = socket.getInputStream();

        byte[] buffer = new byte[1024];

        int length = inputStream.read(buffer);

        String str = new String(buffer,0,length);
        System.out.println(str);

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
