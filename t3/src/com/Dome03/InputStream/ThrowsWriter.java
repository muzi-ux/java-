package com.Dome03.InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThrowsWriter {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        // jdk7在对流的处理中添加了新特性
        /*
         * 在try后面的括号内可以直接声明流对象
         * 此流对象在try语句内有效
         * 在try语句结束后会自动关闭流对象
         * */
        try (        // 创建字节输出流进行读取
                     FileInputStream fis = new FileInputStream("C:\\Users\\rli42\\Pictures\\doesktop\\4k.jpg");

                     // 创建字节输入流进行写入
                     FileOutputStream fops = new FileOutputStream("C:\\Users\\rli42\\Pictures\\doesktop\\test.jpg")) {
            byte[] bytes = new byte[1024];

            while (fis.read(bytes) != -1) {

                fops.write(bytes);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
