package com.neusoft.javaBasicProgramming;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/2 17:12
 * 题目：判断101-200之间有多少个素数，并输出所有素数。
 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
 */

public class Two_APrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入区间最小值：");
        int lowNum = scanner.nextInt();
        System.out.println("请输入区间最大值：");
        int highNum = scanner.nextInt();
        Integer count = judgePrimeNum(lowNum, highNum);
        System.out.println(lowNum + "到" + highNum + "之间有" + count + "个素数");

    }
    public static Integer judgePrimeNum(int lowNum,int highNum){
        int count = 0;
    A:  for (int i = lowNum; i <= highNum; i++) {
            if(i == 2){
                count++;
            }else if(i < 2 || i/2 == 0){
                continue A;
            }else{
                for (int j = 3; j < Math.sqrt(i) + 1; j++) {
                    if(i % j == 0){
                        continue A;
                    }
                }
                count++;
            }
        }
        return count;
    }
}
