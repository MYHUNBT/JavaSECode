package com.neusoft;

import java.util.jar.JarOutputStream;

/**
 * @author liuboting
 * @date 2020/6/7 18:39
 */

public class Mouse implements USB{
    //实现USB，点击方法

    public void click(){
        System.out.println("鼠标点击");
    }

    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }

}
