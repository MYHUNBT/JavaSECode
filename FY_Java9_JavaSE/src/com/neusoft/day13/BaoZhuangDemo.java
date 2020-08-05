package com.neusoft.day13;

/**
 * @author liuboting
 * @date 2020/7/28 11:44
 */

public class BaoZhuangDemo {
    public static void main(String[] args) {
        Integer integer = new Integer(3); //基本 ===》 包装
//        Integer integer1 = Integer.valueOf(4);
        int intValue = integer.intValue(); //包装 ===》 基本
        Integer i = 5;  //自动装箱
        i = i + 5; // 自动拆箱
        int a = 100;
        System.out.println("a的值" + a);
    }
}

