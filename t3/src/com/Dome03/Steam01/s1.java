package com.Dome03.Steam01;

import java.util.stream.Stream;

public class s1 {
    public static void main(String[] args) {
        Stream<String> str = Stream.of("宋二狗", "是", "信球");
        str.forEach(name -> System.out.print(name));
    }
}
