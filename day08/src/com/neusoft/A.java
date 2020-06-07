package com.neusoft;

public interface A {
    default void method(){
        System.out.println("A");
    }
}
