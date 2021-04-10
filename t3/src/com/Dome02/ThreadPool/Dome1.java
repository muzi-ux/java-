package com.Dome02.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Dome1 {
    public static void main(String[] args) {
        // 使用线程池的工厂类Executors中提供的静态方法newFixedThreadPool创建线程池
        ExecutorService exec = Executors.newFixedThreadPool(3);
        // 调用Executors中的的 submit方法传递线程任务执行run方法
        exec.submit(new RunnableImpl());
        exec.submit(new RunnableImpl());
        exec.submit(new RunnableImpl());
        exec.submit(new RunnableImpl());// 该线程执行完毕后程序不会结束，如果线程池被销毁则程序结束

        // 调用Executors中的shutdown方法销毁线程池
        exec.shutdown();
        // 线程池被销毁后无法任务，
        exec.submit(new RunnableImpl());// 此时会抛出异常
    }
}
