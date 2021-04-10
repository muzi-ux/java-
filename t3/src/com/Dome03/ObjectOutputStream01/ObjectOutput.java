package com.Dome03.ObjectOutputStream01;

import java.io.*;

public class ObjectOutput {
    public static void main(String[] args) {
        show02();
    }

    // 对序列化对象进行反序列话操作
    // 在对，对象进行反序列化的对象在序列化时必须继承Serializable接口，此接口是一个标记接口，没有任何方法
    private static void show02() {
        /*
        InvalidClassException异常，当 Serialization 运行时检测到某个类具有以下问题之一时，抛出此异常。
            该类的序列版本号与从流中读取的类描述符的版本号不匹配
            该类包含未知数据类型
            该类没有可访问的无参数构造方法

            在序列化后对对象进行更改后产生的异常
            java.io.InvalidClassException: com.Dome03.ObjectOutputStream01.Person;
            local class incompatible: stream classdesc serialVersionUID = 1365935364770183208, local class serialVersionUID = -6922942444837547287
       */

        /*
        * 每一对象进行序列化后会产生一个序列号
        * 每次进行序列化时都会产生不同的序列号
        * 在进行序列化后，如果对序列化对象进行修改，在进行反序列化操作时会抛出InvalidClassException异常
        * 为了避免InvalidClassException异常的出现，我们在定义序列化类时，通过声明其自己的 serialVersionUID：字段来避免序列号不一致的冲突
         */
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t3\\src\\xlh.txt"))
        ) {
            Person p;
            try {
                Object o = ois.readObject();
                p = (Person) o;
                System.out.println(p);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("反序列化完成");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // 创建序列化对象
    private static void show01() {
        Person p = new Person("滴滴", 18, '男');
        try (
                ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream("t3\\src\\xlh.txt"));
        ) {
            ops.writeObject(p);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("序列化完成");
    }
}
