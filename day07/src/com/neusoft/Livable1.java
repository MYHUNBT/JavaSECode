package com.neusoft;

public interface Livable1 {
    public default void fly(){
        System.out.println("天上飞");
    }
}
