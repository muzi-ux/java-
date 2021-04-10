package com.Dome03.ServerSocket01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        System.out.println("The server starts and waits for connection .... ");
        ServerSocket ss = new ServerSocket(10255);
        Socket server = ss.accept();
        InputStream is = server.getInputStream();
        byte[] b = new byte[1024];
        int len = is.read(b);
        String msg = new String(b, 0, len);
        System.out.println(msg);
        OutputStream out = server.getOutputStream();
        out.write("I'm fine thank you".getBytes());
        out.close();
        is.close();
        server.close();
    }
}
