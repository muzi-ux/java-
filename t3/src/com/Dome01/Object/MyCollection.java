package com.Dome01.Object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("李白");
        collection.add("杜甫");
        collection.add("白居易");
        collection.add("王安石");

        // 使用迭代器遍历
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        // 使用加强for循环遍历
        for(String a : collection){
            System.out.println(a);
        }

        collection.remove("李白");
        System.out.println(collection);

        collection.clear();
        System.out.println(collection);

    }
}
