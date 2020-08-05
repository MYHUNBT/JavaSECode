package com.neusoft.ADailyTopic.Day03_computerSimulations;

/**
 * @author liuboting
 * @date 2020/8/1 14:02
 */

public class Mouse implements USB{
    @Override
    public void start() {
        System.out.println("鼠标开启");
    }

    public void click(){
        System.out.println("鼠标点击");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }
}
