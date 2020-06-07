package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/7 18:38
 */

public class NoteBookComputer{
    // 功能：运行，关机，使用USB

    public void useUSB(USB usb){
        //判断是否有USB
        if(usb != null){
            usb.open();
            if(usb instanceof Mouse){
                Mouse mouse = (Mouse) usb;
                mouse.click();
            }else if(usb instanceof KeyBoard){
                KeyBoard keyboard = (KeyBoard) usb;
                keyboard.input();
            }
            usb.close();
        }
    }
    public void open() {
        System.out.println("电脑运行");
    }


    public void close() {
        System.out.println("电脑关机");
    }

}
