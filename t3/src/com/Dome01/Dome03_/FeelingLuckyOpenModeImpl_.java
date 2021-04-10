package com.Dome01.Dome03_;

import java.util.ArrayList;
import java.util.Random;

public class FeelingLuckyOpenModeImpl_ implements OpenMode{
    private Random random = new Random();
    private int totalMoney;
    private int totalCount;

    // 手气红包实现
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        this.totalCount = totalCount;
        this.totalMoney = totalMoney + 1;
        while (true){
            ArrayList<Integer> list;
            list = myList();
            int carryOn = RightWrong(list);
            if (carryOn != -1) {
                list.remove(carryOn);
                int index = Max(list);
                int number = list.get(index) / 2;
                list.add(number);
                list.add(number);
                list.remove(index);
                return list;
            }
        }
    }

    private ArrayList<Integer> myList(){
        ArrayList<Integer> list = new ArrayList<>();
        int fell = totalMoney;
        while (true){
            int money = random.nextInt(fell);
            if (money > (totalMoney / 2)) {
                continue;
            }else {
                list.add(money);
                fell = fell - list.get(list.size() - 1);
            }
            if (list.size() == totalCount) {
                break;
            }
        }
        return list;
    }

    private int RightWrong(ArrayList<Integer> list){
        int index = 0;
        int j = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                j++;
                index = i;
            }
            sum += list.get(i);
        }
        if (sum < 60) {
            return -1;
        }
        if (j == 1) {
            return index;
        }else {
            return -1;
        }
    }

    private int Max(ArrayList<Integer> list){
        int max = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }
}
