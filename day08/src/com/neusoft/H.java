package com.neusoft;

public interface H extends F,G{
    @Override
    default void method() {
        System.out.println("子接口继承父接口，必须保留关键字");
    }
}
