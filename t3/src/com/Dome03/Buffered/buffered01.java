package com.Dome03.Buffered;

import java.io.*;
import java.util.TreeSet;

public class buffered01 {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        TreeSet<FileString> ts = new TreeSet<>();
        String str = "";
        try (
                BufferedReader br = new BufferedReader(new FileReader("t3\\src\\a.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("t3\\src\\b.txt"));
        ) {
            while ((str = br.readLine()) != null) {
                ts.add(new FileString(str));
            }

            for (FileString t : ts) {
                char[] strList = t.getStr().toCharArray();
                bw.write(strList);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("完成");

    }
}
