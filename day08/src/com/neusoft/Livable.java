package com.neusoft;

public interface Livable {
    //静态方法的使用
    public static void run(){
        System.out.println("跑起来");
    }

    //将func1和func2封装
    //私有方法
    private void func1(){
        System.out.println("func1()");
    }

    private void func2(){
        System.out.println("func2()");
    }
    public default void func(){
        func1();
        func2();
    }
    // 抽象方法重名
    public void show();
    //默认方法重名
    default void method(){
        System.out.println("Livable");
    }
}
