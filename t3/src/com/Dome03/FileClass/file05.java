package com.Dome03.FileClass;

import java.io.File;

public class file05 {
    public static void main(String[] args) {
        /*
            public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
            public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
        */
        show02();
    }

    private static void show02() {
        File file = new File("E:\\java_notes\\code\\T3\\t3\\src");
        File[] files = file.listFiles(); // 返回的时一个File数组，数组内保存的File对象
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    private static void show01() {
        File file = new File("E:\\java_notes\\code\\T3\\t3\\src"); // 如果路径是一个文件或者或者错误的文件夹名则会抛出空指针异常
        String[] list = file.list(); // 返回值是一个String 数组，数组内时给目录下的所有文件或文件夹
        for (String s : list) {
            System.out.println(s);
        }
    }
}
