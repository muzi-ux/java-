package com.Dome03.Recursion;

import java.io.File;

public class recursion03 {
    public static void main(String[] args) {
        File file = new File("E:\\java_notes\\code\\T3\\t3\\src\\com.Dome03");

        show01(file);
    }

    private static void show01(File file) {
//        File[] files = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory() || pathname.getPath().endsWith(".java");
//            }
//        });

        File[] files = file.listFiles((pathname) -> {
                    return pathname.getName().endsWith(".java") || pathname.isDirectory();
                }
        );

        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1);
            } else {
                show01(file1);
            }
        }
    }
}
