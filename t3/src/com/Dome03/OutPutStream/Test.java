package com.Dome03.OutPutStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\rli42\\Pictures\\doesktop\\6.jpg");

//        byte[] b = new byte[fis.available()];
        System.out.println(fis.available());
//        System.out.println(b.length);
    }
}
