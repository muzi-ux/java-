package com.Dome04.Stream01;

import java.util.ArrayList;
import java.util.List;

public class s1 {
    public static void main(String[] args) {
        List<String> add = new ArrayList<>();

        add.add("张无忌");
        add.add("张三丰");
        add.add("周芷若");
        add.add("赵颖");
        add.add("张强");
        add.add("小明");

        // 集合的 stream 方法可以获取到该集合的stream流对象
        add.stream()
                .filter(name -> name.startsWith("张"))//判读字符串是否是 张 开头
                .filter(name -> name.length() == 3)// 判断字符串长度是否是三
                .forEach(name -> System.out.println(name));//遍历集合

    }
}
