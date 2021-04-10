package com.Dome01.DomeImpl;

// 抽象类的子类必须要重写抽象类内的所有方法，或者这个类也是抽象类，这个抽象类的子类必须要重写父亲的方法
public class D02Dome extends D02 {

    @Override
    public void test1() {
        System.out.println("这是第一个测试方法");
    }

    @Override
    public void test2() {
        System.out.println("这是第二个测试方法");
    }
}
