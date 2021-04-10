package com.Dome01.DomeImpl;

// 这是一个抽象类
public abstract class D02 {
    // 这是一个抽象方法，抽象方法必须写在抽象类内，抽象内可以没有抽象方法
    public abstract void test1();

    // 抽象类也可以有普通方法
    public void test2() {
        System.out.println("这个是普通方法！");
    }

}
