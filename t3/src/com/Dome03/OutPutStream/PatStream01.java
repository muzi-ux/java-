package com.Dome03.OutPutStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class PatStream01 {
    public static void main(String[] args) throws IOException {
        /*
        一次写多个字节的方法:
            - public void write(byte[] b):将b.Length字节从指定的字节数组写入此输出流。
            -公共空写(字节[]b)：将b.length字节从指定的字节数组写入此输出流。
            - public void write(byte[] b， int off， int len):从指定的字节数组写入Len字节，从偏移量off开始输出到此输出流
            -公共空写(字节[]b，int off，int len)：从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
        */

        /*
            构造方法：
            FileoutputStream(String name)创建一个向具有指定名称的文件中写入数据的输出文件流。
            FiLeOutputStream(File file)创建一个向指定File对象表示的文件中写入数据的文件输出流。
        */
        // 创建FileOutPutStream 对象
        // FileOutPutStream 对象的构造方法会做三件事
        //  1、创建一个FileOutPutStream对象
        //  2、根据构造方法中传入的路径创建一个文件
        //  3、把该对象指向创建好的文件


        show02();
    }

    private static void show02() throws IOException {
        // 一次创建多个字节的内容
        FileOutputStream pots = new FileOutputStream("C:\\Users\\rli42\\Desktop\\杂货铺\\s.txt");
        byte[] lists = {91, 92, 93, 94, 95, 94};
//        pots.write(lists);
        pots.write(lists,3,3);
        pots.close();

    }

    private static void show01() throws IOException {
        FileOutputStream fops = new FileOutputStream("C:\\Users\\rli42\\Desktop\\杂货铺\\a.txt");
        // 写入一个字节的内容
        fops.write(94);
        fops.write(95);
        fops.write(94);
        // 关闭FileOutPutStream对象释放资源
        fops.close();
    }
}
