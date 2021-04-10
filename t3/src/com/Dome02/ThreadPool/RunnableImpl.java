package com.Dome02.ThreadPool;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始 执行线程任务");
    }
}
