package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/14 14:39
 */

public class InnerDemoTest2 {
    public static void main(String[] args) {
        FlyAble fly = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("起飞");
            }
        };
        fly.fly();
    }
}
