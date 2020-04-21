package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/19 16:30
 */
public class ForForDemo06 {
    public static void main(String[] args) {
        //打印矩形 3*5
        //外层负责换行，里层负责打印
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
