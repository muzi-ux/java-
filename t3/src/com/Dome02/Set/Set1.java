package com.Dome02.Set;

import java.util.*;

public class Set1 {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("里边");
//        set.add("外边");
//        set.add("里边");
//
//
//
//        System.out.println(set);

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.addLast(2);
        list.addFirst(5);
        
        list.removeFirst();
        list.removeLast();

        System.out.println(list);

    }
}
