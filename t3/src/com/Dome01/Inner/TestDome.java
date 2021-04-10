package com.Dome01.Inner;

public class TestDome {
    public static void main(String[] args) {
        // 创建外部类对象
//        InnerClass innerClass = new InnerClass();
        // 创建内部类对象，外部类类名.内部类类名 对象名 = 外部类对象名.new 内部类类名
//        InnerClass.Inner inner = innerClass.new Inner();
//        inner.print();
//        inner.input();


        MyClass myClass = new MyClass(true);
        MyClass.Innermost innermost = myClass.new Innermost();
        System.out.println("外部类的方法执行\n");
        myClass.AtLast();
        myClass.external();
        MyClass.method();
        System.out.println("\n内部类方法执行\n");
        innermost.AtLast1();
        innermost.external1();
    }
}
