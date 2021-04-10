package com.Dome03.OutPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class outPatStream {
    public static void main(String[] args) throws IOException {
        /*
            public class FOSWrite {
                 public static void main(String[] args) throws IOException {
                 // 使用文件名称创建流对象
                 FileOutputStream fos = new FileOutputStream("fos.txt"，true);
                 // 字符串转换为字节数组
                 byte[] b = "abcde".getBytes();
                 // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
                 fos.write(b);
                 // 关闭资源
                 fos.close(); }

             }
         */
//        show01();
        File f = new File("C:\\Users\\rli42\\Pictures\\doesktop\\6.jpg");
        String[] files = f.list();
        System.out.println(Arrays.toString(files));
    }

    private static void show01() throws IOException {
        FileOutputStream fops = new FileOutputStream("C:\\Users\\rli42\\Desktop\\杂货铺\\cs.txt", true);

        byte[] myList = "新年快乐!".getBytes();

        System.out.println(myList.length);

        fops.write(myList);

        fops.close();
    }

}
