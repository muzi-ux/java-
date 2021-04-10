package com.Dome02.Thread2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl1 implements Runnable {

    Lock l = new ReentrantLock();

    private static int a = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                l.lock();
                if (a > 0) {
                    System.out.println("剩余包子" + a + "个");
                    a--;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                l.unlock();
            }
        }
    }
}
