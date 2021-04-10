package com.Dome01.Inner;

public class MyClass {
    private boolean bol = false;

    public MyClass() {
    }

    public MyClass(boolean bol) {
        this.bol = bol;
    }

    public boolean isBol() {
        return bol;
    }

    public void setBol(boolean bol) {
        this.bol = bol;
    }

    public void external(){
        System.out.println("外部类的普通方法");
    }

    public static void method(){
        System.out.println("这是外部类被static修饰的方法");
    }

    public final void AtLast(){
        System.out.println("这是一个被final修饰的方法");
    }

    private void inside(){
        System.out.println("这是一个被private修饰的私有方法");
    }

    class Innermost{
        private boolean bol2 = false;

        public Innermost() {
        }

        public Innermost(boolean bol2) {
            this.bol2 = bol2;
        }

        public boolean isBol2() {
            return bol2;
        }

        public void setBol2(boolean bol2) {
            this.bol2 = bol2;
        }

        public void external1(){
            System.out.println("外部类的普通方法");
            System.out.println("我调用了外部类的private方法");
            inside();
        }

//        public static void method1(){
//            System.out.println("这是外部类被static修饰的方法");
//        }

        public final void AtLast1(){
            System.out.println("这是一个被final修饰的方法");
        }

    }
}
