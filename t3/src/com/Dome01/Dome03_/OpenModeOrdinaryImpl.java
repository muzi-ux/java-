package com.Dome01.Dome03_;

import java.util.ArrayList;

public class OpenModeOrdinaryImpl implements OpenMode{

    // 普通红包的实现
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int money = totalMoney / totalCount;
        int minute = totalMoney % totalCount;
        if (minute == 0){
            for (int i = 0; i < totalCount; i++) {
                list.add(money);
            }
        }else if (totalMoney != 0) {
            for (int i = 0; i < totalCount - 1; i++) {
                list.add(money);
            }
            list.add(minute + money);
        }
        return list;
    }
}
