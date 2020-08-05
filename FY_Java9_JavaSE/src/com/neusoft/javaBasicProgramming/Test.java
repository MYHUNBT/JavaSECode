package com.neusoft.javaBasicProgramming;

import java.io.IOException;

/**
 * @author liuboting
 * @date 2020/8/3 14:57
 */

public class Test {
    public static void main(String[] args) {
        int i = 0;
        int total = 0;
        total = total + (i++) * 2 + (i++);
        System.out.println(total);
    }
}
