package com.Dome03.FileClass;

import java.io.File;
import java.io.IOException;

public class file04 {
    // 创建和删除文件或文件夹
    /*
        public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        public boolean delete() ：删除由此File表示的文件或目录。
        public boolean mkdir() ：创建由此File表示的目录。
        public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录
    */
    public static void main(String[] args) throws IOException {
        show04();
    }

    private static void show04() {
//        File f1 = new File("E:\\java_notes\\code\\T3\\t3\\b");
        // 在删除文件是直接删除，不会通过回收站
        // 删除文件夹时文件夹下有子目录的无法删除
        File f1 = new File("E:\\java_notes\\code\\T3\\t3\\b");
        boolean delete1 = f1.delete();
        System.out.println(delete1);
    }

    private static void show03() {
        File f1 = new File("E:\\java_notes\\code\\T3\\t3\\b\\c\\d\\e");
        boolean mkdirs = f1.mkdirs();
        System.out.println(mkdirs);
    }

    private static void show02() {
        File f1 = new File("E:\\java_notes\\code\\T3\\t3\\a");
        boolean mkdir = f1.mkdir();
        System.out.println(mkdir);
    }

    private static void show01() throws IOException {
//        File f1 = new File("E:\\java_notes\\code\\T3\\t\\1.txt"); // 如果路径不存在的话会抛出 java.io.IOException: 系统找不到指定的路径 的异常
        File f1 = new File("E:\\java_notes\\code\\T3\\t3\\1.txt"); // 如果当前文件已经存在则不会创建文件
        boolean file = f1.createNewFile();
        System.out.println(file);
    }

}
