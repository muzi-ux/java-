package com.Dome01.Domes01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Primary primary = new Primary("群主", 301, 4);
        ArrayList<Double> list = new ArrayList<>();
        list = primary.RedEnvelope();

        Times times = new Times("成员1", 0);
        Times two = new Times("成员2", 0);
        Times three = new Times("成员3", 0);
        times.grad(list);
        two.grad(list);
        three.grad(list);

    }
}
