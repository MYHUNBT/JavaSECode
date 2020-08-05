package com.neusoft.javaBasicProgramming;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/2 19:05
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 * (2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
 */

public class Four_PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = scanner.nextInt();
        String str = num + "=";
        boolean flag = false;
        while (flag == false){
            for (int i = 2; i <= num; i++) {
                if(num%i == 0){
                    num /= i;
                    if(num == 1){
                        str = str + i;
                        flag = true;
                    }else {
                        str = str + i + "*";
                    }
                    break;
                }
            }
        }
        System.out.println(str);
    }
}
