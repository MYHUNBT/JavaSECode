package day10.computerDemo;

/**
 * @author liuboting
 * @date 2020/7/24 16:30
 */

public class Computer {
    //包含运行
    public void run(){
        System.out.println("电脑运行起来了");
    }
    //关机
    public void shutDown(){
        System.out.println("关机");
    }
    //使用USB
    //当电脑调用这个方法时
    public void useUSB(USB usb){
        //判断是否有USB
        if(usb != null){
            usb.open();
            if(usb instanceof Mouse){
                // 进行类型转换，调用特有的方法
                Mouse mouse = (Mouse)usb;
                mouse.click();
            }else if(usb instanceof KeyBoard){
                KeyBoard keyBoard = (KeyBoard)usb;
                keyBoard.type();
            }
            usb.close();
        }
    }
}
