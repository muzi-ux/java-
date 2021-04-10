package com.Dome01.Object;

public class Generic {

    public static void main(String[] args) {
//        MyGeneric<String> myGeneric = new MyGeneric<>("字符串");
//        System.out.println(myGeneric.getTypeOf());
//
//        MyGeneric<Integer> myGeneric1 = new MyGeneric<>(12);
//        System.out.println(myGeneric1.getTypeOf());
//
//        myGeneric1.test1("str");

        GenericInterfaceImpl<String> genericInterface = new GenericInterfaceImpl<>();
        genericInterface.add("字符串");
        System.out.println(genericInterface.returns("mi"));
        genericInterface.show(1);
    }
}
