package com.neusoft.ADailyTopic.Day03_computerSimulations;

/**
 * @author liuboting
 * @date 2020/8/1 14:03
 */

public class Test {
    public static void main(String[] args) {
        USB mouse = new Mouse();
        USB keyBoard = new KeyBoard();
        Computer computer = new Computer();
        computer.useUSB(mouse);
    }
//    public static void useUSB(USB usb){
//        if(usb instanceof Mouse){
//            Mouse mouse = (Mouse) usb;
//            mouse.start();
//            mouse.click();
//            mouse.close();
//        }else {
//            KeyBoard keyBoard = (KeyBoard) usb;
//            keyBoard.start();
//            keyBoard.knock();
//            keyBoard.close();
//        }
//    }
}
