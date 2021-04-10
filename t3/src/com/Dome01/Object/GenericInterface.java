package com.Dome01.Object;

public interface GenericInterface<E> {

    public void add(E e);

    public E returns(E a);

    public <MVP> void show(MVP myp);
}
