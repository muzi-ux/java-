package com.Dome03.HTTPServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class httpserver {
    private ServerSocket myServer;

    void server() {
        try {
            myServer = new ServerSocket(10255);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread() {
                @Override
                public void run() {
                    try (
                            Socket accept = myServer.accept();
                    ) {
                        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                        String head = br.readLine();
                        String url = head.split(" ")[1].substring(1);
                        System.out.println("url:" + url);
                        FileInputStream fis = new FileInputStream("t3\\web\\" + url);
                        byte[] bytes = new byte[1024];
                        int len;
                        OutputStream os = accept.getOutputStream();
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content‐Type:text/html\r\n".getBytes());
                        os.write("\r\n".getBytes());
                        while ((len = fis.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }
                        fis.close();
                        os.close();
                        br.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }.start();
        }
    }
}
