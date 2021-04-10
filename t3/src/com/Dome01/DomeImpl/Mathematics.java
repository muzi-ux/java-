package com.Dome01.DomeImpl;

import java.util.ArrayList;

// 使用interface 关键字定义接口
public interface Mathematics {
/*
     默认方法：使用 default 修饰，不可省略，供子类调用或者子类重写。
    public default int  removea(ArrayList<?> list){
        return 0;
    }
     抽象方法：使用 abstract 关键字修饰，可以省略，没有方法体。该方法供子类实现使用。
    public abstract void remove(); // 没有花括号方法体
*/
    // 随机的删除集合内一个元素并返回
    public default ArrayList<Integer> remove(ArrayList<Integer> list){
        return new ArrayList<>();
    }

    // 把一个列表内的元素添加到集合内
    public default ArrayList<Double> add(double[] list){
        return new ArrayList<Double>();
    }

    // 查找集合内的元素下标
    public default int index(ArrayList<Integer> list){
        return -1;
    }

    // 根据下标替换指定元素
    public default boolean replace(ArrayList<Integer> list, int index){
        return false;
    }

    public abstract ArrayList<Integer> remove1(ArrayList<Integer> list);
}