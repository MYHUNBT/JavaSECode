package com.neusoft.day13;

import java.util.Date;

/**
 * @author liuboting
 * @date 2020/7/28 10:06
 */

public class TestSystem {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
//        System.out.println(new Date().getTime());
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.print(i);
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end-start));
    }
}
