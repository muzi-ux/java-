package com.Dome01.DomeImpl;

// 这是一个测试接口
public interface D01 {
    // 这是一个抽象方法
    public abstract void test1();
    // 这也是一个抽象方法
    public void test2();
    // 这也是一个抽象方法
    abstract void test3();
    // 这也是一个抽象方法
    void test4();
    // 这是一个默认方法
    public default void test5(){
        System.out.println("这是一个默认方法");
    }
}
