package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/31 20:50
 */

public class AnimalLivable implements Livable{
    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void sleep() {
        System.out.println("睡");
    }
}
