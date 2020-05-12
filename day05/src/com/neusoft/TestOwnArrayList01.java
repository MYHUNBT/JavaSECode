package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/10 20:55
 * 自己实现一个ArrayList01
 */

public class TestOwnArrayList01 {
    public static void main(String[] args) {
//        OwnArrayList01 list01 = new OwnArrayList01();
        OwnArrayList01 list01 = new OwnArrayList01(15);
        System.out.println(list01.getCapacity());
        System.out.println(list01.getSize());
        System.out.println(list01.isEmpty());
    }
}