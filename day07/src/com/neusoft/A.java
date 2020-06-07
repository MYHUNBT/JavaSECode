package com.neusoft;

public interface A {
    //抽象方法
    public abstract void eat();
    public void sleep();
    //默认方法：使用default修饰，不可以省略，功能是供子类调用或者重写
    public default void method(){
        //执行语句
    }
    //静态方法：使用static修饰，供接口调用
    public static void method2(){
        //执行语句
    }
    /*私有方法：使用private修饰，供接口中的默认方法或者静态方法调用
    private void method3(){
        //执行语句
    }*/
}
