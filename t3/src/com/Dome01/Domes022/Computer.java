package com.Dome01.Domes022;

public class Computer {
    public void Open(){
        System.out.println("打开设备");
    }

    public void Close(){
        System.out.println("关闭设备");
    }

    public void use(USB usb){
        usb.open();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.input();
        }
        usb.close();
    }
}
