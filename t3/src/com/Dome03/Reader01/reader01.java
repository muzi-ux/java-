package com.Dome03.Reader01;

import java.io.*;

public class reader01 {
    public static void main(String[] args) {
        show04();
    }

    private static void show04() {
        
        try (
                InputStreamReader isr = new InputStreamReader(new FileInputStream("t3\\src\\GBK_TEST.txt"));
                OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("t3\\src\\GBK_TEST(2).txt"), "GBK");
        ) {
            char[] c = new char[1024];
            while ((isr.read(c)) != -1) {
                osw.write(c);
            }


        } catch (IOException e) {
            System.out.println(e);
        }

        try (
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("t3\\src\\GBK_TEST(2).txt"), "GBK");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("t3\\src\\GBK_TEST.txt"), "GBK")
        ) {
            char[] c = new char[1024];
            while (inputStreamReader.read(c) != -1){
                outputStreamWriter.write(c);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        File f = new File("t3\\src\\GBK_TEST(2).txt");
        boolean d = f.delete();
        if(d) System.out.println("操作成功");

    }

    // 使用OutputStreamWriter对象指定写入文件的编码
    private static void show03() {
        try (
                OutputStreamWriter opsw = new OutputStreamWriter(new FileOutputStream("t3\\src\\t.txt"), "GBK");
        ) {
            String str = "小田同学";
            for (int i = 0; i < 521; i++) {
                opsw.write(str + "\n");
            }
            System.out.println("完成");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // 使用InputStreamReader对象指定打开文件的编码解决乱码问题
    private static void show02() {
        try (
                InputStreamReader isr = new InputStreamReader(new FileInputStream("t3\\src\\GBK_TEST.txt"), "GBK");
        ) {
            int len = 0;
            while ((len = isr.read()) != -1) {
                System.out.print((char) len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // 因为保存的文件是GBK编码，而BufferedReader对象的默认打开编码是UTF-8所以会出现乱码情况
    // 如果使用UTF-8编码保存的文件，则读取时不会乱码
    private static void show01() {
        String s = "";
        try (
                BufferedReader br = new BufferedReader(new FileReader("t3\\src\\GBK_TEST.txt"))
        ) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
