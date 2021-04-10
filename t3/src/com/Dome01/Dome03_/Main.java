package com.Dome01.Dome03_;

public class Main {

    public static void main(String[] args) {
        OpenModeOrdinaryImpl openModeOrdinary = new OpenModeOrdinaryImpl();
        System.out.println(openModeOrdinary.divide(61, 6));
        Red red = new Red("普通红包");
        OpenModeImpl openMode = new OpenModeImpl();
        red.setOwnerName("群主");
        red.setOpenWay(openMode);
//        OpenModeOrdinaryImpl openModeOrdinary1 = new OpenModeOrdinaryImpl();
//        red.setOwnerName("群主");
//        red.setOpenWay(openModeOrdinary1);
//        System.out.println(openMode.divide(61, 6));
    }
}
