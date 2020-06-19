package com.neusoft.homework5;

/**
 * @author liuboting
 * @date 2020/6/18 18:37
 */

public class Worker {
    public Apple pickApple(CompareAble compareAble,Apple a1,Apple a2){
        Apple apple = compareAble.compare(a1, a2);
        return apple;
    }
}
