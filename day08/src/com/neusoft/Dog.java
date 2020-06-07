package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/7 15:06
 */

public class Dog extends Animal implements Livable,Pat {
    // 多实现的格式：class 类名 [extends 父类名] implements 接口1，接口2...{}
    // 必须重写接口中的抽象方法
    // 默认方法可重写可不重写
    @Override
    public void shouyang() {
        System.out.println("shouyang()");
    }

    @Override
    public void show() {
        System.out.println("show()");
    }

    @Override
    public void method() {
        System.out.println("Dog");
    }

    public void eat(){
        System.out.println("吃狗粮");
    }
}
