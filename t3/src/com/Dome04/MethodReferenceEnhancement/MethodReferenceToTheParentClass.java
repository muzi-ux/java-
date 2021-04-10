package com.Dome04.MethodReferenceEnhancement;

public class MethodReferenceToTheParentClass {
    // super测试方法
    public static void MySuber(SuperQuote s) {
        s.quote(1);
    }

    public static void myPersonSuper(String name, PersonInterface p) {
        Person person = p.newPerson(name);
        System.out.println(person.getName());
    }



    public static void main(String[] args) {
//        MySuber(name -> System.out.println(name));

//        myPersonSuper("小田", Person::new);
//        myPersonSuper("didi", (name) -> new Person(name));


    }
}
