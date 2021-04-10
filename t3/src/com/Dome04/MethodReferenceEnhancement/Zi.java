package com.Dome04.MethodReferenceEnhancement;

public class Zi extends Fu {
    public static void main(String[] args) {
//        printPerson(()->{
//            Zi.printZi();
//        });

//        printPerson(Zi::printZi);

    }

    @Override
    public void printFu() {
        System.out.println("这是儿子重写父亲的方法");
    }

    public static void printZi() {
        System.out.println("这是儿子独有的方法");
    }

    public static void printPerson(Method m) {
        m.pt();
    }
}
