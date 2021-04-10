package com.Dome03.InputStream;

import java.io.FileWriter;
import java.io.IOException;

public class writer1 {
    public static void main(String[] args) throws IOException {
        show02();
    }

    private static void show02() throws IOException{
        FileWriter f = new FileWriter("t3\\src\\e.txt");
        f.write("测试\n你好");
        f.close();

    }

    private static void show01() throws IOException {
        FileWriter fw = new FileWriter("t3\\src\\c.txt");

        fw.write("这是一个测试文件,text");

        // flush方法只会把内存中的数据刷新到硬盘，不会关闭流对象
        fw.flush();
        //close方法会做两件事，首先把内存中的数据刷新到硬盘然后关闭流对象，流对象关闭后就无法继续使用了
        fw.close();
    }
}
