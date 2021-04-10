package com.Dome03.FileClass;

import java.io.File;

public class file03 {
    /*
        public boolean exists() ：此File表示的文件或目录是否实际存在。
        public boolean isDirectory() ：此File表示的是否为目录。
        public boolean isFile() ：此File表示的是否为文件。
    */
    public static void main(String[] args) {
        dome03();
    }

    private static void dome03() {
        File f1 = new File("E:\\java_notes\\notes");
//        System.out.println(f1.exists());//         public boolean exists() ：此File表示的文件或目录是否实际存在。
//        System.out.println(f1.isDirectory());//        public boolean isDirectory() ：此File表示的是否为目录。
        System.out.println(f1.isFile());//         public boolean isFile() ：此File表示的是否为文件。


    }
}
