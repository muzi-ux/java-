package com.Dome02.Thread1;

public class Dome02Thread extends Thread{
    public Dome02Thread(){}

    public Dome02Thread(String name){
        super(name);
    }

    @Override
    public void run() {
//        setName("第一");
        System.out.println(getName());
    }
}
