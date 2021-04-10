package com.Dome01.Object;

public class MyGeneric<T> {
    private T typeOf;

    public MyGeneric() {
    }

    public MyGeneric(T typeOf) {
        this.typeOf = typeOf;
    }

    public T getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(T typeOf) {
        this.typeOf = typeOf;
    }

    public <T1> void test1(T1 t1){
        System.out.println("这是一个使用了泛型的方法" + t1);
    }
}
