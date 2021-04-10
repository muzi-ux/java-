package com.Dome01.NoName;

public class NoClass {
    private String name;
    private NoNameClass noNameClass;

    public NoClass() {
    }

    public NoClass(String name, NoNameClass noNameClass) {
        this.name = name;
        this.noNameClass = noNameClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NoNameClass getNoNameClass() {
        return noNameClass;
    }

    public void setNoNameClass(NoNameClass noNameClass) {
        this.noNameClass = noNameClass;
    }

    public void print(){
        System.out.println(name + "使用了");
        noNameClass.attack();
        System.out.println("攻击了你");
    }
}
