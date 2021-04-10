package com.Dome01.Domes01;

import java.util.ArrayList;
import java.util.Random;

public class Times extends Most {
    // 成员类，负责抢红包

    private static int id = 1;

    public Times() {
        id = ++id;
    }

    public Times(String userName, double Balance) {
        super(userName, Balance);
        id = ++id;
    }

    public void grad(ArrayList<Double> list) {
        Random subscript = new Random(1);
        super.userLook();
        // 获取集合长度
        int length1 = list.size();
        // 生成随机数
        int number = subscript.nextInt(length1);
        // 修改成员金额
        setBalance(list.remove(number));
        super.userLook();
    }
}
