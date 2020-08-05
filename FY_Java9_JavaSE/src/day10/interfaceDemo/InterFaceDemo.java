package day10.interfaceDemo;

public interface InterFaceDemo {
    public abstract void method();
    //供子类调用或重写
    public default void defaultMethod(){}
    //供接口直接调用
    public static void staticMethod(){}
    //供接口中静态方法或默认方法使用
    private void privateMethod(){}


}
