package com.neusoft.javaBasicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/6 10:37
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 程序分析：利用辗除法。
 */

public class Six_RollingDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数：");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(new Six_RollingDivision().showMaxDivisor2(m,n));
//        System.out.println(new Six_RollingDivision().showMaxDivisor(m,n));
//        System.out.println(new Six_RollingDivision().showMinMultiple(m,n));
    }
    public Integer showMaxDivisor(int m,int n){
        int maxcomdivisor = 0;
        for (int i = 1; i <= (m>n? n:m); i++) {
            if(m%i == 0 && n%i == 0){
                maxcomdivisor = i;
            }
        }
        return maxcomdivisor;
    }
    public Integer showMinMultiple(int m,int n){
        int mincommultiple = 0;
        while (true){
            mincommultiple++;
            if(mincommultiple%m == 0 && mincommultiple%n==0){
                return mincommultiple;
            }
        }
    }
    public Integer showMaxDivisor2(int m,int n){
        if(m == 0 || n == 0){
            return m==0? n:m;
        }
        if(m>n){
            return showMaxDivisor2(m%n,n);
        }else {
            return showMaxDivisor2(n%m,m);
        }
    }
}
