package com.Dome01.DomePolymorphism;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        // 调用showCatEat
        showCatEat(c);
        showDogEat(d);
        // 以上两个方法, 均可以被showAnimalEat(Animal a)方法所替代 而执行效果一致
        showAnimalEat(c);
        showAnimalEat(d);
        System.out.println("---------------------------------------");
        // 转型，类的向上转型，自动执行
        Animal animal = new Cat();
        animal.eat();
        // 向下转型，强制执行,向下转型是，等号右边是什么对象转型回去是必须也是该对象，如果不是该对象可以通过编译但是执行会报错
        // 向下转型时注意使用instanceof 关键字进行判断，避免出行错误，该关键字的返回值时个布尔值
        if (animal instanceof Cat) {
            Cat cat1 = (Cat) animal;
            cat1.drink();
        }

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.drink();
        }

        // 在向下转型是需要注意使用
    }

    public static void showCatEat(Cat c) {
        c.eat();
    }

    public static void showDogEat(Dog d) {
        d.eat();
    }

    public static void showAnimalEat(Animal a) {
        a.eat();
        a.drink();
    }
}
