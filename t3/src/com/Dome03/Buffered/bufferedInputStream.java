package com.Dome03.Buffered;

import java.io.*;

public class bufferedInputStream {
    public static void main(String[] args) throws IOException {
        show01();
    }

    // 使用普通字节流传递数组参数复制文件,耗时48毫秒
    private static void show04() {
        long k = System.currentTimeMillis();
        try(
                FileInputStream fis = new FileInputStream("D:\\迅雷下载\\MediaCreationTool20H2.exe");

                FileOutputStream fos = new FileOutputStream("t3\\src\\copy.exe");
                ){
            byte[] c = new byte[4 * 1024];

            while (fis.read(c) != -1){
                fos.write(c);

            }
        }catch (IOException e){
            System.out.println(e);
        }

        long j = System.currentTimeMillis();

        System.out.println("程序耗时:" + (j-k));

    }

    // 使用普通的字节流复制文件,耗时未知，
    private static void show03() throws IOException{
        long k = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\迅雷下载\\MediaCreationTool20H2.exe");
        FileOutputStream fos = new FileOutputStream("t3\\src\\copy.exe");

        int len;
        while((len = fis.read()) != -1){
            fos.write(len);
        }

        fos.close();

        fis.close();

        long j = System.currentTimeMillis();

        System.out.println("程序耗时:" + (j-k));
    }

    // 使用字节缓冲流传递数组参数 复制文件耗时32毫秒
    private static void show02() {
        long k = System.currentTimeMillis();
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\迅雷下载\\MediaCreationTool20H2.exe"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("t3\\src\\copy.exe"));
        ){
            byte[] b = new byte[4 * 1024];
            while((bis.read(b)) != -1){
                bos.write(b);
            }
        }catch(IOException e){
            System.out.println(e);
        }
        long j = System.currentTimeMillis();

        System.out.println("程序耗时:" + (j-k));
    }

    //使用字节缓冲流单个复制 耗时719毫秒
    private static void show01() throws IOException{
        long k = System.currentTimeMillis();
        // 创建字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\迅雷下载\\MediaCreationTool20H2.exe"));
        // 创建字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("t3\\src\\copy.exe"));

        // 读取并写入数据
        int len;
        while ((len = bis.read())!= -1){
            bos.write(len);
        }

        // 关闭流资对象释放资源
        bos.close();

        bis.close();

        long j = System.currentTimeMillis();
        System.out.println("程序耗时: " + (j-k));
    }
}
