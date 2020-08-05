package day10.interfaceDemo;

/**
 * @author liuboting
 * @date 2020/7/24 14:36
 */

public class TestInterface {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.fly();
        LiveAble.run();
    }
}
