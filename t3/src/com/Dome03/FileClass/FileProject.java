package com.Dome03.FileClass;

import java.io.File;
import java.util.Scanner;

public class FileProject {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("请输路径：");
        String url = input.next();
        System.out.println("\t1、安装" +
                "\n\t2、卸载");
        System.out.print("请选择：");
        int number = input.nextInt();
        if (number == 1) {
            theLard(url);
        } else if (number == 2) {
            delete(new File(url));
            System.out.println("卸载完成");
        }
    }

    private static void delete(File myFile) {

        File[] filesList = myFile.listFiles();

        for (File f : filesList) {
            if(f.isDirectory()){
                if(!f.delete()) {
                    delete(f);
                }
            }
            if(f.isFile()){
                if(f.delete()){
                    continue;
                }
            }
        }

    }


    public static void theLard(String url) {
        File f = new File(url);
        if (dirKong(f)) {
            if (kong(f)) {
                dirNull(f);
            } else {
                System.out.println("无法安装");
            }
        } else {
            System.out.println("无法安装");
        }
    }

    // 判断该文件夹是否是空文件夹为创建项目做准备
    public static boolean kong(File file01) {
        if (file01.isDirectory()) {
            return file01.listFiles().length == 0;
        } else {
            return false;
        }
    }

    // 判断该路径是否指向的是一个文件夹
    public static boolean dirKong(File mf) {
        if (mf.exists()) {
            return mf.isDirectory();
        }
        return false;
    }

    // 判断该文件夹是否存在，如果存在则不再创建
    public static void dirNull(File f) {
        String[] listString = {"\\src", "\\out", "\\main"};
        for (int i = 0; i < listString.length; i++) {
            File dir = new File(f.getAbsolutePath() + listString[i]);
            if (!dir.exists()) {
                dir.mkdir();
            }
        }

        System.out.println("安装成功");
    }
}
