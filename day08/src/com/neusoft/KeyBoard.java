package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/7 18:40
 */

public class KeyBoard implements USB{
    //实现USB，输入功能
    public void input(){
        System.out.println("键盘输入");
    }

    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

}
