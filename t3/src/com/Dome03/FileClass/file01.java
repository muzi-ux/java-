package com.Dome03.FileClass;

import java.io.File;

public class file01 {
    public static void main(String[] args) {
        /*
        file 类的构造方法
            public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
            public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
            public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例。
        */

        dome03();
    }

    private static void dome03() {
        // public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例。
        // 父路径为抽象的file路径在拼接上子路径，为一个完整的路径
        File f3 = new File("E:\\java_notes\\code");
        File f4 = new File(f3,"a.txt");
        System.out.println(f4);
    }

    private static void dome02() {
//           public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
        // 父路径和子路径拼接后成为一个完整的路径，好处是加大了路径的可变性
        File f2 = new File("E:\\","a.txt");
        System.out.println(f2);
    }

    private static void dome01() {
        // public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
        File f1 = new File("E:\\java_notes\\code");
        System.out.println(f1);
    }
}
