package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/7 14:25
 */

public class InterfaceTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
   //     animal.run(); //报错，无法继承静态方法，也无法调用
        Livable.run();
        animal.func();
        Dog dog = new Dog();
        dog.method();
    }

}
