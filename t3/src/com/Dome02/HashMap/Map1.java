package com.Dome02.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        HashMap<Integer, String> list = new HashMap<>();

        list.put(1,"里边");
        list.put(2,"外边");
        list.put(3,"中心");

        System.out.println(list);

        Set<Integer> set = list.keySet();

        Iterator<Integer> i1 = set.iterator();
        while (i1.hasNext()){
//            System.out.println(i1.next());
            System.out.println(list.get(i1.next()));
        }
        System.out.println("------------------");
        for(Integer a : set){
            System.out.println(a);
            System.out.println(list.get(a));

        }
    }
}
