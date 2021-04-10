package com.Dome03.InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        long k = System.currentTimeMillis();
        // 创建字节输出流进行读取
        FileInputStream fis = new FileInputStream("C:\\Users\\rli42\\Pictures\\doesktop\\4k.jpg");

        // 创建字节输入流进行写入
        FileOutputStream fops = new FileOutputStream("C:\\Users\\rli42\\Pictures\\doesktop\\test.jpg");


        byte[] bytes = new byte[1024];

        while(fis.read(bytes) != -1){

            fops.write(bytes);
        }

        fops.close();

        fis.close();
        long j = System.currentTimeMillis();
        System.out.println("程序执行耗时" + (j-k) + "毫秒");
    }
}
