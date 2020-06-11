package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/7 20:48
 */

public class FinalDemo1 {
    public static void main(String[] args) {
        //声明一个变量，使用final修饰
        final int a;
        a = 10;
        System.out.println(a);
        /*报错不可重新赋值
        a = 11;
        */
    }
}
