package com.Dome02.Thread1;

//import static java.lang.Thread.currentThread;

import com.Dome02.Thread2.RunnableImpl1;

public class Main {
    public static void main(String[] args) {
//        DomeThread d1 = new DomeThread();
//        d1.start();
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println("main --> " + i);
//        }
//        Dome02Thread d1 = new Dome02Thread("ee");
//        d1.start();
//        System.out.println(Thread.currentThread().getName());

//        for (int i = 0; i < 60; i++) {
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//        RunnableImpl run = new RunnableImpl();
//        Thread th = new Thread(run);
//        th.start();
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println(Thread.currentThread().getName() + "--->" + i);
//        }



//        Runnable2Impl run = new Runnable2Impl();

        RunnableImpl1 run = new RunnableImpl1();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();

    }
}
