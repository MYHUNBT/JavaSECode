package com.neusoft.javaBasicProgramming;

/**
 * @author liuboting
 * @date 2020/8/9 19:34
 */

public class Sixteen_MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
