package day10.interfaceDemo;

public interface LiveAble {
    void eat();
    void sleep();
    static void run(){
        System.out.println("冲冲冲");
    }
    default void fly(){
        heart();
        System.out.println("飞飞飞");
    }
    //只有默认方法可以调用
    private void heart(){
        System.out.println("活着");
    }
}
