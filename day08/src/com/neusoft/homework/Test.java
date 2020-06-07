package com.neusoft.homework;

/**
 * @author liuboting
 * @date 2020/6/7 19:06
 */

public class Test {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        System.out.println("==============");
        Star sun = new Sun();
        sun.doAnything();
        Sun star1 = (Sun)sun;
        star1.shine();
    }
}
