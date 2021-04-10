package com.Dome03.InputStream;

import java.io.FileReader;
import java.io.IOException;

public class reader1 {
    public static void main(String[] args) {
        try {
            show01();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void show01() throws IOException {
        //创建FileRead 对象，构造方法的参数可以是路径字符串，也可以是File对象
        FileReader fr = new FileReader("t3\\src\\a.txt");
        int i = 0;
        // FileRead的read方法可以读取文件内的数据，当读取到最后没有数据是会返回-1
        // read方法没有参数时，读取的是单个字符
//        while ((i = fr.read()) != -1){
//            System.out.print((char)i);
//        }
        // 当给read方法传递数组参数时，read方法会将内容读取到数组内
        char[] c = new char[1024];
        while ((i = fr.read(c)) != -1){
            System.out.println(c);
        }

        fr.close();
    }
}
