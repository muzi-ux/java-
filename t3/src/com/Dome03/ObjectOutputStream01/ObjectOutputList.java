package com.Dome03.ObjectOutputStream01;

import java.io.*;
import java.util.ArrayList;

public class ObjectOutputList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        show03();
    }

    // 使用PringStream 改变打印流的流向
    private static void show03() throws IOException{
        // 创建PrintStream 对象
        PrintStream ps = new PrintStream(".\\t3\\src\\test.txt");
        // 改变打印流的流向
        System.setOut(ps);
        // 打印随意数据
        System.out.println(18);

    }

    private static void show02() throws IOException, ClassNotFoundException {
        // 创建集合存储读取的对象
        ArrayList<Person> list;
        //创建ObjectInputStream 对象进行反序列话操作
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t3\\src\\list.txt"));
        // 对读取到的对象进行反序列话操作，并写入到列表
        Object o = ois.readObject();
        //对读取到的数据进行强制类型转换
        list = (ArrayList<Person>) o;
        for (Person p : list) {
            System.out.println(p);
        }
    }

    // 序列化集合练习
    private static void show01() throws IOException, ClassNotFoundException {
        // 创建ArrayLis集合保存对象
        ArrayList<Person> al = new ArrayList<>();

        // 向集合内添加Person对象
        al.add(new Person("小田", 18, '女'));
        al.add(new Person("小李", 20, '男'));
        al.add(new Person("小王", 19, '男'));

        //创建ObjectInputStream对象
        ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("t3\\src\\list.txt"));

        // 吧对象列表序列化后写入文件
        ois.writeObject(al);

        // 关闭资源
        ois.close();
    }
}
