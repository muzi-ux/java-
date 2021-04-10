package com.Dome01.DomeImpl;

import java.util.ArrayList;

// 这是一个抽象类
public abstract class Ascert {

    // 这是一个简单的抽象方法,找寻一组数据的最大值
    public abstract int Max(ArrayList<Integer> list);


    // 这个抽象方法是找寻一组数据的最小值
    public abstract double Min(ArrayList<Double> list);

    // 这个抽象方法是计算一组数据累加的和
    public abstract int Sum(ArrayList<Integer> list);

    // 这个抽象方法是，对一个数取绝地址
    public abstract int Abs(int number);
}
