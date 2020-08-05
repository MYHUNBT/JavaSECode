package com.neusoft.day16;

/**
 * @author liuboting
 * @date 2020/7/31 15:43
 */

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public void change(){
        System.out.println("猫叫什么名字：" + this.name);
    }
}
