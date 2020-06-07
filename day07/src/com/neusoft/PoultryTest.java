package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/6 17:30
 */

public class PoultryTest {
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子",2,"发烧","感冒");
        duck.showMsg();
        duck.showSymptom();
    }
}
