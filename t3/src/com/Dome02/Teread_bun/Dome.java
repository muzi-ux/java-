package com.Dome02.Teread_bun;

public class Dome {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        BaoZiPu bzp = new BaoZiPu("包子铺", bz);
        ChiHuo ch = new ChiHuo("吃货", bz);
        ch.start();
        bzp.start();
    }
}
