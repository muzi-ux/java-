package com.Dome01.DomeInterface;

public interface InterfaceTest2 {
    // 抽象方法
    public abstract void t1();

    // 默认方法,吧小写字母转换为大写字母
    public default String ConversionMin(String list){
        char[] Slist = new char[list.length()];
        for (int i = 0; i < list.length(); i++) {
            int character = list.charAt(i) - 32;
            Slist[i] = (char)character;
        }
        return new String(Slist);
    }

    // 静态方法,格式化字符串，去除非法字符
    public static String filter(String str){
        char[] characters = new char[str.length()];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character != ' ' & character != '\n' && character != '\t'){
                characters[j] = str.charAt(i);
                j++;
            }
        }
        return new String(characters);
    }
}
