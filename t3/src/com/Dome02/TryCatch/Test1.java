package com.Dome02.TryCatch;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String[] arr = {"里边", "外部", "中间"};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入:");
        String name = input.next();
        for (String s : arr) {
            if (name.equals(s)) {
                System.out.println(s);
                return;
            }
        }
        try {
            throw new Abnormal("数据不在数组中");
        } catch (Abnormal abnormal) {
            abnormal.printStackTrace();
        }

    }
}
