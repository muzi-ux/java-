package com.Dome03.FileClass;

import java.io.File;

public class file02 {

    public static void main(String[] args) {
        dome02();
    }

    private static void dome02() {
        File f2 = new File("a.txt");
        // 返回此file类对象的绝对路径
        String abs = f2.getAbsolutePath();
        System.out.println(abs);
        String s = f2.getPath();
        System.out.println(s);
    }

    private static void dome01() {
        // public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        File f1 = new File("E:\\java_notes\\notes");
        // public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        System.out.println(f1.getAbsolutePath());
        // public String getPath() ：将此File转换为路径名字符串。
        System.out.println(f1.getPath());
        // public String getName() ：返回由此File表示的文件或目录的名称。
        System.out.println(f1.getName());
        // public long length() ：返回由此File表示的文件的长度。
        System.out.println(f1.length());
    }
}
