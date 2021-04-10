package com.Dome01.DomeInterface;

public class Main {
    public static void main(String[] args) {
        InterfaceTesst1Impl interfaceTesst1 = new InterfaceTesst1Impl();

        interfaceTesst1.MT();
        InterfaceTest1.WordsPuzzle();
        System.out.println(interfaceTesst1.ConversionMax("LASHGLSNLSKEJHGLI"));

        interfaceTesst1.t1();
        System.out.println(InterfaceTest2.filter("skhfkshk\nlhsfk\t    lskhdgflksdjflksdjh\n\tldsjflksl"));
        System.out.println(interfaceTesst1.ConversionMin("lfjslidjfslkjdflksdhglksj"));
    }
}
