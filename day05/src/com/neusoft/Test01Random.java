package com.neusoft;

import java.util.Random;

/**
 * @author liuboting
 * @date 2020/5/10 17:30
 */

public class Test01Random {
    public static void main(String[] args) {
        // Random 类用于生成伪随机数
        Random random = new Random();
        // [0, n) 的随机整数
        int i = random.nextInt(100);
        System.out.println(i);


    }
}
