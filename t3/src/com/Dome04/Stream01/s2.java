package com.Dome04.Stream01;

import java.util.stream.Stream;

public class s2 {
    public static void main(String[] args) {
//        streamConcateTest();
        int i = 1;
        int j = 1;
        System.out.println(i++);
        System.out.println(++j);
    }

    // 如果有两个流，希望合并成为一个流，那么可以使用 Stream 接口的静态方法 concat
    private static void streamConcateTest() {
        Stream<String> st1 = Stream.of("张三", "李四", "王五", "麻子", "傻子");
        Stream<String> st2 = Stream.of("1", "2", "3", "4");

        Stream.concat(st1, st2).forEach(name -> System.out.println(name));
    }

    // skip：如果希望跳过前几个元素，可以使用 skip 方法获取一个截取之后的新流：
    private static void streamSkipTest() {
        Stream<String> st1 = Stream.of("张三", "李四", "王五", "麻子", "傻子");
        Stream<String> skip = st1.skip(3);
        skip.forEach(name -> System.out.println(name));
    }

    // limit 方法可以对流进行截取，只取用前n个
    private static void streamLimitiTest() {
        // limit 方法可以对流进行截取，只取用前n个。
        Stream<String> st1 = Stream.of("张三", "李四", "王五", "麻子", "傻子");
        // 对stream流进进行截取仅取前三个
        Stream<String> limit = st1.limit(3);

        limit.forEach(name -> System.out.println(name));
    }

    private static void streamCountTest() {
        // 正如旧集合 Collection 当中的 size 方法一样，流提供 count 方法来数一数其中的元素个数
        Stream<String> st1 = Stream.of("张三", "李四", "王五", "麻子", "傻子");
        // stream流使用完count方法后则无法使用其他流的方法
        System.out.println(st1.count());
    }

    // map方法
    private static void streamMapTest() {
        // 如果需要将流中的元素映射到另一个流中，可以使用 map 方法
        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
        Stream<String> st1 = Stream.of("1", "2", "3", "4");
        // 通过map方法根据传入的lambda表达式的规则吧字符串的数字转换为Integer类型的数据
        Stream<Integer> integerStream = st1.map((String s) -> Integer.parseInt(s));
        integerStream.forEach(naem -> System.out.println(naem));
    }

    // stream流中的filter方法
    private static void streamFilterTest() {
        // 可以通过 filter 方法将一个流转换成另一个子集流。
        // Stream<T> filter(Predicate<? super T> predicate);
        Stream<String> st1 = Stream.of("张三", "李四", "王五", "麻子", "傻子");
        Stream<String> st2 = Stream.of("1", "2", "3", "4");
        // filter方法根据传递的lambada表达式的返回值判断是否存入子集流
        Stream<String> st3 = st1.filter((name) -> name.startsWith("李"));
        st3.forEach(name -> System.out.println(name));
    }
}
