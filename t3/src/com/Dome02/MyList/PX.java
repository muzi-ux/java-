package com.Dome02.MyList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PX {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("李白", 1));
        list.add(new Student("李白", 8));
        list.add(new Student("李白", 19));
        list.add(new Student("李白", 11));
        list.add(new Student("李白", 13));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(list);
    }
}
