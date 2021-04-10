package com.Dome03.ServerSocket01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) {
        try {
            show01();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void show01() throws IOException {
        /*
        // 1.创建 Socket ( ip , port ) , 确定连接到哪里.
        Socket client = new Socket("localhost", 6666);
        // 2.通过Scoket,获取输出流对象
        OutputStream os = client.getOutputStream();
        // 3.写出数据.
        os.write("你好么? tcp ,我来了".getBytes());
        // ==============解析回写=========================
        // 4. 通过Scoket,获取 输入流对象
        InputStream in = client.getInputStream();
        // 5. 读取数据数据
        byte[] b = new byte[100];
        int len = in.read(b);
        System.out.println(new String(b, 0, len));
        // 6. 关闭资源 .
        in.close(); os.close(); client.close();
        */

        //创建连接对象
        Socket s = new Socket("121.41.200.110",10255);
//        Socket s = new Socket("127.0.0.1",6666);
//        通过Soceet对象获取OutputStream对象
        OutputStream os = s.getOutputStream();
        // 写出数据
        os.write("hello".getBytes());
        // 通过Socet获取到输入流对象
        InputStream in = s.getInputStream();
        //读取返回数据
        byte[] b = new byte[1024];
        int len = in.read(b);
        System.out.println(new String(b));
//        System.out.println(new String(b,0,len));
        //关闭资源
        in.close();
        os.close();
        s.close();
    }
}
