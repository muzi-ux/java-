package com.Dome04.Reflection;

import java.lang.reflect.Constructor;

public class reflection1 {
    public static void main(String[] args) throws Exception {
        /*2.获取构造方法
         * Constructor<?>[] getConstructors()
         * Constructor<T> getConstructor(类<?> ...parameterTypes)

         * Constructor<T> getDeclaredConstructor(类<?> ...parameterTypes)
         * Constructor<?>[] getDeclaredConstructors()
         */

        // 获取类构造器对象
        Class personClass = Person.class;
        // 根据获取到的类对象传入参数类型,构造,构造方法
        Constructor constructor = personClass.getConstructor(String.class, String.class, String.class, String.class);
        // 根据构造方法创建对象
        Object o = constructor.newInstance("1", "2", "3", "4");
        System.out.println(o);

        System.out.println("---------------------");

        Constructor constructor1 = personClass.getConstructor();
        Object o1 = constructor1.newInstance();
        System.out.println(o1);

        System.out.println("---------------------");

        Constructor[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Object o2 = personClass.newInstance();
        System.out.println(o2);
    }
}
