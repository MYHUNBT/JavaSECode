package day10.interfaceDemo;

/**
 * @author liuboting
 * @date 2020/7/24 14:35
 */

public class Animal implements LiveAble {
    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void sleep() {
        System.out.println("睡");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

}
