package com.Dome01.Dome1201;

public class Zi extends Fu{
    public String name;
    public void t2(){
        // 子类没有name属性，继承父类的name属性
        System.out.println("zi我是" + name);
        // 调用父类重名属性
        System.out.println("zi wo shi " + super.name);
    }

    @Override
    public void fuu(){
        super.fuu();
        System.out.println("重写父类方法");
    }
}
