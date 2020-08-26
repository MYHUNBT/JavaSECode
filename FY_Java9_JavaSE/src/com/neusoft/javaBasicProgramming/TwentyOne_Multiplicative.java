package com.neusoft.javaBasicProgramming;

/**
 * @author liuboting
 * @date 2020/8/12 18:57
 * 题目：求1+2!+3!+...+20!的和
 * 程序分析：此程序只是把累加变成了累乘。
 */

public class TwentyOne_Multiplicative {
    public static void main(String[] args) {
        System.out.println(sumMultiplicative(20));
    }
    public static Long multiplicative(int n){
        if(n == 1){
            return 1L;
        }
        return n*multiplicative(n-1) ;
    }
    public static Long sumMultiplicative(int n){
        Long sum = 0L;
        Long temp = 1L;
        for (int i = 1; i <= n; i++) {
            temp *= i;
            sum += temp;
        }
        return sum;
    }
}
