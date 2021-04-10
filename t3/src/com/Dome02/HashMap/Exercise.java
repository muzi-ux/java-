package com.Dome02.HashMap;

import java.util.HashMap;

public class Exercise {
    public static void main(String[] args) {
        str("skldfjsdl");
    }

    private static void str(String str1) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i : str1.toCharArray()){
            if(map.containsKey(i)){
                Integer i1 = map.get(i);
                i1++;
                map.put(i, i1);
            }else{
                map.put(i, 1);
            }
        }

        for(Character i : map.keySet()){
            Integer i1 = map.get(i);
            System.out.println(i + "=" + i1);
        }
    }
}
