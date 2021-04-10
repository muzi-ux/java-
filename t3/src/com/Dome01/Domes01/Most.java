package com.Dome01.Domes01;

// 主要的方法
public class Most {
    // 身份
    private String userName;
    // 余额
    private double Balance;

    public Most() {
    }

    public Most(String userName, double Balance) {
        this.userName = userName;
        this.Balance = Balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void userLook() {
        System.out.println("你的身份是" + this.userName + "红包余额是" + this.Balance);
    }
}
