package com.Dome01.Dome03_;

import java.util.ArrayList;
import java.util.Random;

public class OpenModeImpl implements OpenMode {
    private int totalMoney;
    private int totalCount;
    private Random random = new Random();

    // 手气红包实现
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        this.totalCount = totalCount;
        this.totalMoney = totalMoney;
        while (true) {
            ArrayList<Integer> list1;
            ArrayList<Integer> list2;

            list1 = list();
            list2 = Map1(list1);
            if (list2.get(2) == 0) {
                if (list2.get(3) < totalMoney) {
                    list1.add(totalMoney - list2.get(3));
                    return list1;
                }
            }
        }
    }

    private ArrayList<Integer> list() {
        ArrayList<Integer> MyList = new ArrayList<>();
        int fell = this.totalMoney;
        for (int i = 0; i < totalCount - 1; i++) {
            if (fell != 0) {
                int money = random.nextInt(fell);
                MyList.add(money);
                if (i > 1) {
                    fell = MyList.get(i - 1);
                }
            }
        }
        return MyList;
    }

    private ArrayList<Integer> Map1(ArrayList<Integer> list) {
        ArrayList<Integer> myList = new ArrayList<>();
        int max = list.get(0);
        int min = list.get(0);
        int zero = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
            if (min > list.get(i)) {
                min = list.get(i);
            }
            if (0 == list.get(i)) {
                zero++;
            }
            sum += list.get(i);
        }
        myList.add(max);
        myList.add(min);
        myList.add(zero);
        myList.add(sum);

        return myList;
    }
}
