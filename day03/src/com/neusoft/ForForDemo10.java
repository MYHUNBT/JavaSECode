package com.neusoft;

import static java.lang.Math.sqrt;

/**
 * @author liuboting
 * @date 2020/4/19 18:23
 * 打印·~100之间的所有质数，并按照3个一行的形式输出
 */
public class ForForDemo10 {
    public static void main(String[] args) {
        int count = 0;
        a:for (int i = 1; i <=100 ; i++) {
            if(i%2 == 0 || i < 2)
                continue;
            for (int j = 2; j <= sqrt(i); j++) {
                if(i%j == 0)
                    continue a;
            }
            count++;
            System.out.print(i + "\t");
            if (count%3 == 0){
                System.out.println();
            }
        }

    }
}
    /*int count = 0;
    int flag = 3;
       a: for (int i = 2; i <= 100 ; i++) {
               for (int j = 2; j < i ; j++) {
        if (i % j == 0)
        // 走到这里，说名不是质数
        continue a;
        }
        System.out.print(i + (++count % flag == 0 ? " \n":"\t"));

     */