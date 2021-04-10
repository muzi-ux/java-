package com.Dome02.Thread1;

public class DomeThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run -->" + i);
        }
    }
}
