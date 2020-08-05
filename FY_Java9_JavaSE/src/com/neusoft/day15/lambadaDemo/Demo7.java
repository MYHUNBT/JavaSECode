package com.neusoft.day15.lambadaDemo;

/**
 * @author liuboting
 * @date 2020/7/30 17:02
 */

public class Demo7 {
    public static void main(String[] args) {
        invokeShow(1,a -> a + 10);
    }
    public static void invokeShow(int a,Show show){
        int i = show.showNum(a);
        System.out.println(i);
    }
}
