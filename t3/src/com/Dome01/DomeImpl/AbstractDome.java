package com.Dome01.DomeImpl;

import java.util.ArrayList;

public class AbstractDome extends Ascert {
    @Override
    public int Max(ArrayList<Integer> list) {
        if(list.size() <= 0) return -1;
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    @Override
    public double Min(ArrayList<Double> list) {
        if(list.size() <= 0) return -1;
        double min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }

    @Override
    public int Sum(ArrayList<Integer> list) {
        if(list.size() <= 0) return -1;
        int sum = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            sum += list.get(i);
        }
        return sum;
    }

    @Override
    public int Abs(int number) {
        if (number == 0) return 0;
        if (number > 0) {
            return number;
        }else {
            return -number;
        }
    }
}
