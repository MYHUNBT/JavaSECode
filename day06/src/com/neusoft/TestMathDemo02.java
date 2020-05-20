package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/17 20:53
 * 请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
 */

public class TestMathDemo02 {
    public static void main(String[] args) {
        int number = 0;
        double max = 5.9;
        double min = -10.8;
        for (int i = (int) Math.ceil(min); i <= (int)Math.floor(max); i++) {
            if(Math.abs(i) < 2.1 || Math.abs(i) > 6){
                number++;
            }
        }
        System.out.println(number);
    }
}
