package com.neusoft;

public class K implements F,G{

    @Override
    public void method() {
        System.out.println("子类实现接口，不可以保留关键字");
    }
}
