package com.Dome02.Lmbda;

import java.util.Arrays;

public class DemoComparator {
    public static void main(String[] args) {
        Person[] people = {
                new Person("李白", 100),
                new Person("王安石", 10),
                new Person("白居易", 88)
        };

//        Comparator<Person> comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };
//
//        Arrays.sort(people, comparator);
//
        Arrays.sort(people, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        // 优化lambda表达式
        Arrays.sort(people, (o1, o2) -> o1.getAge() - o2.getAge());

        for (Person person : people) {
            System.out.println(person);
        }

        test1();
    }

    static void test1() {
        Integer[] list = {2, 4, 7, 17, 9};

//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        };
//
//        Arrays.sort(list, comparator);
        Arrays.sort(list, (Integer o1, Integer o2) -> {
            return o1 - o2;
        });

        // 优化lambda表达式
        Arrays.sort(list, (o1, o2) -> o1 - o2);

        for (Integer i1 : list) {
            System.out.println(i1);
        }
    }
}
