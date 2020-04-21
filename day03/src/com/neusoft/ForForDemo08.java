package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/19 18:07
 * 打印5*5的倒三角形
 */
public class ForForDemo08 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
