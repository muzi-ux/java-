package com.Dome01.DomeInterface;

// 接口可以多继承
public class InterfaceTesst1Impl implements InterfaceTest1,InterfaceTest2 {
    @Override
    public void MT() {
        System.out.println("重写接口方法");
    }

    @Override
    public void t1() {
        System.out.println("重写了第二个接口中的方法");
    }

//    @Override
//    public String Conversion(char character) {
//        return null;
//    }
}
