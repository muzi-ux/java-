package com.Dome02.Thread1;

public class Runnable2Impl implements Runnable {
    private int i = 100;

    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            // 解决线程安全的的第一种方法,创建安全锁
            synchronized (obj) {
                if (i > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                    i--;
                }
            }
        }
    }
}
