package com.Dome04.ObjectReference;

public class ObjRes {

    public static void ps(printObject p) {
        p.myPrint("你好");
    }

    public static void main(String[] args) {
        ps(s -> System.out.println(s));

        ps(System.out::println);


    }
}
