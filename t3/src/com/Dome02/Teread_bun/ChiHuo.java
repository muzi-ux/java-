package com.Dome02.Teread_bun;

public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                // 是否有包子
                if (!bz.flag) {
                    try {
                        // 让线程进入等待
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货正在吃" + bz.pi + bz.xie + "馅的包子");
                bz.flag = false;
                System.out.println("吃货吃完包子了\n" +
                        "---------------------------");
                bz.notify();
            }
        }
    }
}
