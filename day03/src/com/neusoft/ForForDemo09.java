package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/19 18:14
 */
public class ForForDemo09 {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");

            }
            System.out.println();
        }
    }
}
