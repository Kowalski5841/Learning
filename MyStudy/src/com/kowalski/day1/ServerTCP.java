package com.kowalski.day1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];

        int length = inputStream.read(buffer);
        String str = new String(buffer,0,length);

        System.out.println(str);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("我很好，谢谢客户端".getBytes());

        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
