package com.Dome02.Lmbda;

public class DomeCook {
    public static void main(String[] args) {
        t1(()->{
            System.out.println("didi");
        });
    }

    public static void t1(Cook cook){
        cook.makeFood();
    }
}
