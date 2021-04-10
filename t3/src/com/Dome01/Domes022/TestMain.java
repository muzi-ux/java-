package com.Dome01.Domes022;

public class TestMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.Open();
        computer.use(new Mouse());
        Keyboard keyboard = new Keyboard();
        computer.use(keyboard);
        computer.Close();
    }
}
