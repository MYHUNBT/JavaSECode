package com.neusoft.homework5;

/**
 * @author liuboting
 * @date 2020/6/18 18:38
 */

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println("默认挑大的:");
        Apple apple1 = new Apple(5,"青色");
        Apple apple2 = new Apple(3,"红色");
        Apple apple = worker.pickApple(new Compare(),apple1, apple2);
        System.out.println(apple);
        Apple appleHong = worker.pickApple(new Compare() {
            @Override
            public Apple compare(Apple a1, Apple a2) {
                System.out.println("挑红的：");
                return "红色".equals(a1.getColor()) ? a1 : a2;
            }
        }, apple1, apple2);
        System.out.println(appleHong);
    }
}
