package com.Dome03.Recursion;

import java.io.File;

public class recursion02 {
    public static void main(String[] args) {
        File file = new File("E:\\java_notes\\code\\T3\\t3");
        Traverse(file);
    }

    public static void Traverse(File file){
        File[] fileList = file.listFiles();
        for (File txt : fileList) {
            // getPath 方法是把file对象转换为字符串
            // toLowerCase 方法是吧大写转换为小写
            // endWith 方法是判断该文件已什么后缀结尾
            if(txt.getPath().toLowerCase().endsWith(".iml")) {
                System.out.println(txt);
            }
            if(txt.isDirectory()){
                Traverse(txt);
            }
        }
    }
}
