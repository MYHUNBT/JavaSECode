package com.neusoft.ADailyTopic.Day03_computerSimulations;

/**
 * @author liuboting
 * @date 2020/8/1 14:02
 */

public class KeyBoard implements USB {
    @Override
    public void start() {
        System.out.println("键盘开启");
    }

    public void knock(){
        System.out.println("敲键盘");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }
}
