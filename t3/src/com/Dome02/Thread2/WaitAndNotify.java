package com.Dome02.Thread2;

public class WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    // 使用同步技术，保证等待和唤醒的线程只能执行一个
                    synchronized (obj) {
                        System.out.println("老板得知客户需要的包子数量，开始做包子");
                        // 让线程进入等待
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("买家吃完包子");
                        System.out.println("------------------------------------------");
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("一段时间后老板做好包子之后，通知买家吃包子");
                        // 唤醒线程
                        obj.notify();

                        System.out.println("当前线程名称" + Thread.currentThread().getName());
                    }
                }
            }
        }.start();
    }
}
