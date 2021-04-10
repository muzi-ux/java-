package com.Dome03.OutPutStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class imgTest {
    public static void main(String[] args) throws IOException {
        byte[] mb = ImageByte("C:\\Users\\rli42\\Pictures\\doesktop\\6.jpg");

        Image(mb,"C:\\Users\\rli42\\Pictures\\doesktop\\test.jpg");

        System.out.println("结束");
    }

    public static byte[] ImageByte(String urls) throws IOException {
        FileInputStream fis = new FileInputStream(new File(urls));

        byte[] bs = new byte[fis.available()];

        fis.read(bs);

        fis.close();

        return bs;
    }

    static void Image(byte[] mb, String MyUrl) throws IOException {
        FileOutputStream fops = new FileOutputStream(MyUrl);

        fops.write(mb);

        fops.close();

    }

}
