package com.Dome02.HashCod;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        print();

//        person();

        person2();

    }

    private static void person2() {
        ArrayList<Person> list01 = new ArrayList<>();

        list01.add(new Person("李白", 18));
        list01.add(new Person("李白", 19));
        list01.add(new Person("李白", 10));
        list01.add(new Person("李白", 20));

        System.out.println("排序前" + list01);

        // 使用匿名对象重写了 Comparator的compare 方法，使用重写后排序
        Collections.sort(list01, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
//                return 0;
                return o2.getAge() - o1.getAge();
            }
        });

        System.out.println("排序后" + list01);
    }

/*    private static void person() {
        ArrayList<Person> list01 = new ArrayList<>();

        list01.add(new Person("李白", 18));
        list01.add(new Person("李白", 19));
        list01.add(new Person("李白", 10));
        list01.add(new Person("李白", 20));

        System.out.println("排序前" + list01);

        Collections.sort(list01); *//*无法排序*//*

        System.out.println("排序后" + list01);
    }*/

    private static void print() {
        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("李白", 18);
        Person p2 = new Person("李白", 18);
        Person p3 = new Person("李白", 19);

        set.add(p1);
        set.add(p2);
        set.add(p3);

//        System.out.println(set);

        LinkedHashSet<String> link = new LinkedHashSet<>();
        link.add("1");
        link.add("3");
        link.add("2");
        link.add("1");

//        Collections.sort(link);
//        System.out.println(link);

        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(5);
        list01.add(2);
        list01.add(7);

        System.out.println("排序前" + list01);

        Collections.sort(list01);

        System.out.println("排序后" + list01);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("z");
        list02.add("b");
        list02.add("w");

        System.out.println("排序前" + list02);

        Collections.sort(list02);
        System.out.println("排序后" + list02);
    }


}
