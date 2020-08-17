package com.neusoft.javaBasicProgramming;

/**
 * @author liuboting
 * @date 2020/8/11 12:41   1 2 3 4
 * 题目：打印出如下图案（菱形） 1 3 6 8
 *     *
 *    ***
 *  ******
 * ********
 *  ******
 *   ***
 *    *
 * 程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重 for循环，第一层控制行，第二层控制列。
 */

public class Nineteen_Diamond {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4-i; j >= 1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 3; i >= 1; i--) {
            for (int j = 3-i; j >= 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 2*i-1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
