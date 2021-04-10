package com.Dome01.DomeImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        D01Lpml test = new D01Lpml();
//        test.test1();
//        test.test2();
//        test.test3();
//        test.test4();
//        test.test5();

//        D02Dome d02 = new D02Dome();
//        d02.test1();
//        d02.test2();
        AbstractDome abstractDome = new AbstractDome();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(7);
        int max = abstractDome.Max(list);
        System.out.println("最大值是:" + max);

        ArrayList<Double> list1 = new ArrayList<Double>();
        list1.add(0.4);
        list1.add(0.2);
        list1.add(0.9);
        list1.add(0.1);
        list1.add(0.2);
        list1.add(0.7);
        double min = abstractDome.Min(list1);
        System.out.println("最小值是：" + min);


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(2);
        list3.add(9);
        list3.add(1);
        list3.add(2);
        list3.add(7);
        int sum = abstractDome.Sum(list3);
        System.out.println("累加的结果为" + sum);

        int abs = abstractDome.Abs(-2);
        System.out.println(abs + "的绝对值是" + abs);
    }
}
