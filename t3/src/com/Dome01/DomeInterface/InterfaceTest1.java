package com.Dome01.DomeInterface;

public interface InterfaceTest1 {
    // 接口中可以包含抽象方法，默认方法，静态方法

    // 抽象方法需要用abstract 关键字修饰
    public abstract void MT();

    // 静态方法要用static 关键字修饰
    public static void WordsPuzzle() {
        // 静态方法可以拥有方法体，且不可被实现类重写，只能通过接口名调用
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }

    }

    // 默认方法default 关键字修饰
    public default String ConversionMax(String str) {
        // 默认方法用来供实现类进行从写
//        实现从大写到小写的转换
        char[] character = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) + 32;
            character[i] = (char) index;
        }
        return new String(character);
    }
}
