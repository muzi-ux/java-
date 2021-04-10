package com.Dome04.ObjectReference;

public class DomeTestObject {

    public static void printStr(printObject p) {
        p.myPrint("你好呀!");
    }

    public static void main(String[] args) {
        ObjectPrint op = new ObjectPrint();
        printStr(op::printObj);
    }
}
