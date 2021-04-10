package com.Dome03.ServerSocket01;

import java.io.*;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        System.out.println("开始创建连接...");
        try (
                // 创建Socket对象
                 Socket sc = new Socket("121.41.200.110", 10255);
//                Socket sc = new Socket("localhost", 10255);
                //根据socket对象创建字节输入
                InputStream is = sc.getInputStream();
                // 根据socket对象创建输出流
                OutputStream os = sc.getOutputStream();
                // 创建字节缓冲流
                BufferedInputStream fop = new BufferedInputStream(new FileInputStream("C:\\Users\\rli42\\Pictures\\doesktop\\k2.jpg"));

        ) {
            byte[] c = new byte[1024 * 3];
            int len = 0;
//            os.write("hello".getBytes());
//            is.read(c);
            System.out.println(new String(c));
            System.out.println("连接以就绪...");
            while ((len = fop.read(c)) != -1){
                os.write(new String(c,0,len).getBytes());
            }
            System.out.println("复制结束");
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
