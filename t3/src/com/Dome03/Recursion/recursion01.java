package com.Dome03.Recursion;

public class recursion01 {
    public static void main(String[] args) {
        int number = show02(5);
        System.out.println(number);
    }

    private static int show02(int i) {
        if(i == 1){
            return 1;
        }

        return i * show02(i -1);
    }

    private static int show01(int i) {
        if(i==0){
            return 1;
        }
        i--;
         return 0;
    }
}
