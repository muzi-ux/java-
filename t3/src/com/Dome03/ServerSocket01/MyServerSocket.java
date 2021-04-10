package com.Dome03.ServerSocket01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
    public static void main(String[] args) {
        System.out.println("The server starts and waits for connection .... ");
        try (
                ServerSocket sc = new ServerSocket(10255);
                Socket accept = sc.accept()
        ) {
            InputStream is = accept.getInputStream();
            OutputStream os = accept.getOutputStream();
            byte[] c = new byte[1024 * 4];
            int len = 0;
            BufferedOutputStream fo = new BufferedOutputStream(new FileOutputStream("..\\a.txt"));
            while ((len = is.read(c)) != -1){
                fo.write(new String(c,0,len).getBytes());
            }
            os.write("I'm fine thank you".getBytes());

            fo.close();
            os.close();
            is.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Copy complete...");
    }
}
