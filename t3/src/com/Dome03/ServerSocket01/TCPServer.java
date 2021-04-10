package com.Dome03.ServerSocket01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("The server starts and waits for connection .... ");
//        File f = new File("/root/user");
        File f = new File("C:\\Users\\rli42\\Desktop\\杂货铺\\text(2)");
        boolean a = f.exists() ? true : f.mkdirs();
        ServerSocket s = new ServerSocket(15555);
        while (true) {
            new Thread(() -> {
                try (
                        Socket accept = s.accept();
//                        FileOutputStream fos = new FileOutputStream("/root/user/" + new Date().getTime() + new Random().nextInt(9999999) + ".jpg");
//                        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\rli42\\Desktop\\杂货铺\\text(2)\\k2.jpg"));
                        FileOutputStream fos = new FileOutputStream("C:\\Users\\rli42\\Desktop\\杂货铺\\text(2)\\" + new Date().getTime() + new Random().nextInt(9999999) + ".jpg");
                        InputStream is = accept.getInputStream();
//                        OutputStream os = accept.getOutputStream();
                ) {
                    byte[] b = new byte[1024];
                    int len;
                    while ((len = is.read(b)) != -1) {
                        fos.write(b, 0, len);
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            }).start();
        }
    }
}
