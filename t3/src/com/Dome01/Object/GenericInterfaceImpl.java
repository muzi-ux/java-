package com.Dome01.Object;

public class GenericInterfaceImpl<E> implements GenericInterface<E>{
    @Override
    public void add(E e) {
        System.out.println("使用泛型之后" + e);
    }

    @Override
    public E returns(E a) {
        return a;
    }

    @Override
    public <MVP> void show(MVP myp) {
        System.out.println("MVP" + myp);
    }
}
