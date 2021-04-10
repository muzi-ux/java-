package com.Dome03.ServerSocket01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Server02 {
    public static void main(String[] args) {
        System.out.println("开始连接服务器...");

        try (
//                Socket s1 = new Socket("127.0.0.1", 15555);
                Socket s1 = new Socket("121.41.200.110", 10255);
                FileInputStream fis = new FileInputStream("C:\\Users\\rli42\\Desktop\\杂货铺\\text\\k1.jpg");
                InputStream is = s1.getInputStream();
                OutputStream os = s1.getOutputStream();
        ) {
            System.out.println("对象创建完成...");
            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read(b)) != -1) {
                os.write(b);
            }
            System.out.println("操作完成");
            is.close();
            os.close();
            fis.close();
            System.out.println("复制结束");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
