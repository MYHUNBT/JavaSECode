package com.neusoft.javaBasicProgramming;

import java.util.Collections;

/**
 * @author liuboting
 * @date 2020/8/19 18:35
 */

public class TwentyFour_ReversePrinting {
    public static void main(String[] args) {
        reversePrint(12345);
    }
    public static void reversePrint(int num){
        String str = String.valueOf(num);
        String[] split = str.split("");
        System.out.println(num + "是" + split.length + "位数");
        for (int i = split.length-1; i >= 0; i--) {
            System.out.print(split[i] + "\t");
        }
    }
}
