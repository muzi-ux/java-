package com.Dome01.DomePolymorphism;

public abstract class Animal {
    // abstract 关键字用来修饰抽象方法
    public abstract void eat();

    public abstract void drink();

    public static void look(){
        // 静态方法，需要通过类名调用
        System.out.println("这是一个静态方法");
    }
}
