package com.Dome01.NoName;

public class TestMainImpl {

    public static void main(String[] args) {
//        DomeClass domeClass = new DomeClass() {
//            @Override
//            public void test() {
//                System.out.println("这是一个匿名内部类");
//            }
//        };
//
//        showDomeClass(domeClass);

        showDomeClass(new DomeClass() {
            @Override
            public void test() {
                System.out.println("简化写法，创建匿名内部类");
            }
        });
    }

    public static void showDomeClass(DomeClass domeClass){
        domeClass.test();
    }
}
