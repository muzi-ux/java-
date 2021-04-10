package com.Dome01.NoName;

public class NoMain {

    public static void main(String[] args) {
        NoClass noClass = new NoClass();
        noClass.setName("李白");

        noClass.setNoNameClass(new NoNameClass() {
            @Override
            public void attack() {
                System.out.println("将进酒");
            }
        });
        noClass.print();
    }

}
