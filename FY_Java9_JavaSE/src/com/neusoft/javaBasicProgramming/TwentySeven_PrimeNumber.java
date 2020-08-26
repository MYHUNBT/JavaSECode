package com.neusoft.javaBasicProgramming;

/**
 * @author liuboting
 * @date 2020/8/19 18:59
 * 求100之内的素数
 */

public class TwentySeven_PrimeNumber {
    public static void main(String[] args) {
        A: for (int i = 2; i < 100; i++) {
            if(i == 2) System.out.println(i);
            if(i % 2 == 0){
                continue;
            }else {
                for (int j = 2; j < Math.sqrt(i)+1; j++) {
                    if(i%j == 0){
                        continue A;
                    }
                }
                System.out.println(i);
            }

        }

    }
//    public static void printPrimeNumber(int n){
//        if(n%2 != 0){
//            for (int i = 3; i < Math.sqrt(n)+1; i++) {
//                if(n%i == 0){
//                    break;
//                }
//            }
//        }
//    }
}
