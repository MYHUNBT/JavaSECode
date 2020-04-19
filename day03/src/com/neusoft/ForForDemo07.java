package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/19 18:07
 * 打印五行五列的正三角形
 */
public class ForForDemo07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
