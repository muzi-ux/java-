package com.Dome02.Lmbda;

public class RunnmalImpl extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程正在执行");
    }
}
