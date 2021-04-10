package com.Dome03.HTTPServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTPServerSocket {
    public static void main(String[] args) {
        try {
            show01();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void show01() throws IOException{
        // 开启监听端口
        ServerSocket serverSocket = new ServerSocket(8080);
        while(true){
            new Thread(){
                @Override
                public void run() {
                    try {
                        // 获取Socket对象
                        Socket accept = serverSocket.accept();
                        // 获取输入流
                        InputStream inputStream = accept.getInputStream();
                        // 根据浏览器发了的请求头获取请求对象创建字符流对象
                        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//                        InputStreamReader br = new InputStreamReader(inputStream);
                        // 根据获取的对象进行解析
                        String s = br.readLine();
                        String strs = s.split(" ")[1].substring(1);
                        FileInputStream fis = new FileInputStream(strs);
                        byte[] bytes= new byte[1024];
                        int len = 0 ;
                        // 获取输出流
                        OutputStream outputStream = accept.getOutputStream();
                        // 写入HTTP协议响应头,固定写法
                        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
                        outputStream.write("Content‐Type:text/html\r\n".getBytes());
                        // 重要   必须要写入空行,否则浏览器不解析
                        outputStream.write("\r\n".getBytes());
                        while ((len = fis.read(bytes)) != -1){
                            outputStream.write(bytes,0,len);
                        }
                        fis.close();
                        br.close();
                        outputStream.close();
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
