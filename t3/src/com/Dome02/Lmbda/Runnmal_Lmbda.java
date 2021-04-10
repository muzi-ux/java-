package com.Dome02.Lmbda;

public class Runnmal_Lmbda {
    public static void main(String[] args) {
        Thread t = new RunnmalImpl();
        t.start();
        System.out.println("-------------------------------");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("-------------------------------");
                System.out.println(Thread.currentThread().getName() + "线程正在执行");
            }
        });
        t1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("-------------------------------");
                System.out.println(Thread.currentThread().getName() + "线程正在执行");
            }
        }).start();

        new Thread(() -> {
            System.out.println("-------------------------------");
            System.out.println(Thread.currentThread().getName() + "线程正在执行");
        }).start();
    }
}
