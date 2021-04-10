package com.Dome02.Teread_bun;

public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int number = 0;
        while (true){
            synchronized(bz){
                if(bz.flag){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("包子铺开始生产包子");
                if(number % 2 == 0){
                    bz.pi = "冰皮";
                    bz.xie = "韭菜鸡蛋";
                    bz.flag = true;
                    bz.notify();
                }
                if(number % 2 == 1){
                    bz.pi = "普通";
                    bz.xie = "虾仁";
                    bz.flag = true;
                    bz.notify();
                }
                number++;
                System.out.println("包子做好了可以吃了\n" +
                        "--------------------------------------");
            }
        }
    }
}
