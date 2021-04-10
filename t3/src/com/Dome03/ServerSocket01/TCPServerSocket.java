package com.Dome03.ServerSocket01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Random;

public class TCPServerSocket {
    public static void main(String[] args){
        try {
            show01();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void show01() throws IOException{
        System.out.println("The server starts and waits for connection .... ");
        File f = new File("/root/user");
        boolean a = f.exists() ? true : f.mkdirs();
        ServerSocket s = new ServerSocket(10255);
        while (true) {
            new Thread(() -> {
                try (
                        Socket accept = s.accept();
                        FileOutputStream fos = new FileOutputStream("/root/user/" + new Date().getTime() + new Random().nextInt(9999999) + ".jpg");
                        InputStream is = accept.getInputStream();
                ) {
                    byte[] b = new byte[1024];
                    int len;
                    while ((len = is.read(b)) != -1) {
                        fos.write(b, 0, len);
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
                System.out.println("this operation has been completed");
            }).start();
        }
    }
}
