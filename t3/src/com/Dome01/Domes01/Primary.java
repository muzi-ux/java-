package com.Dome01.Domes01;

import java.util.ArrayList;

public class Primary extends Most {
    // 群主类负责发红包

    // 所发红包的个数
    private int quantity;

    // 群主类的无参构造
    public Primary() {
    }

    // 群主类的有参构造
    public Primary(String userName, double Balance, int quantity) {
        super(userName, Balance);
        this.quantity = quantity;
    }

    // 群主开始发红包，对余额进行等分，如果不能整除，则把余数分给最后一位
    public ArrayList<Double> RedEnvelope() {
        ArrayList<Double> list = new ArrayList<>();
        super.userLook();
        // 每一个红包的金额
        double money = getBalance() / this.quantity;
        // 查看是否有余额
        double overage = getBalance() % this.quantity;

        for (int i = 0; i < quantity; i++) {
            if (overage == 0) {
                list.add(money);
            } else {
                if (i == quantity - 1) {
                    list.add(money + overage);
                } else {
                    list.add(money);
                }
            }
        }
        return list;
    }
}
