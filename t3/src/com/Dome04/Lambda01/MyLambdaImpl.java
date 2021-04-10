package com.Dome04.Lambda01;

public class MyLambdaImpl {
    public static void main(String[] args) {
//        test(() -> {
//            System.out.println("wo");
//        });
        String s1 = "hello";
        String s2 = "word";
        String s3 = "java";

        t1(1, s1 + s2 + s3);
    }

    public static void test(MyLambda m) {
        m.lambdas();
    }

    public static void t1(int eval, String msg) {
        if (eval == 1) {
            System.out.println(msg);
        }
    }
}
