package com.Dome02.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Entry1 {
    // 通过获取hashmap 内的entry 对象来遍历map集合

    public static void main(String[] args) {
        HashMap<Integer, String> list = new HashMap<>();

        list.put(1, "你");
        list.put(2, "我");
        list.put(3, "他");

        Set<Map.Entry<Integer, String>> list2 = list.entrySet();

        Iterator<Map.Entry<Integer, String>> i1 = list2.iterator();

        while (i1.hasNext()){
            Map.Entry<Integer, String> m1 = i1.next();
            System.out.println(m1.getKey());
            System.out.println(m1.getValue());
        }
        System.out.println("--------------------------------");
        for(Map.Entry<Integer, String> i : list2){
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }
    }
}
