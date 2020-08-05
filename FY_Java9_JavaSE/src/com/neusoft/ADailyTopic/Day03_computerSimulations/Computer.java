package com.neusoft.ADailyTopic.Day03_computerSimulations;

/**
 * @author liuboting
 * @date 2020/8/1 18:07
 */

public class Computer implements USB {

    @Override
    public void start() {
        System.out.println("电脑开启");
    }

    @Override
    public void close() {
        System.out.println("电脑关闭");
    }

    public void useUSB(USB usb){
        if(usb != null){
            this.start();
            if(usb instanceof Mouse){
                Mouse mouse = (Mouse) usb;
                mouse.start();
                mouse.click();
                mouse.close();
            }else if(usb instanceof KeyBoard){
                KeyBoard keyBoard = (KeyBoard) usb;
                keyBoard.start();
                keyBoard.knock();
                keyBoard.close();
            }
            this.close();
        }
    }
}
