package com.neusoft.javaBasicProgramming;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/2 15:45
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 * 问第_个月的兔子对数为多少？
 * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 */

public class One_Recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第几个月：");
        int month = scanner.nextInt();
        Integer sum = showNumber(month);
        System.out.println("第" + month + "个月有" + sum + "对兔子");
    }
    public static Integer showNumber(int month){
        int[] arr = new int[month];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= month-1; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[month-1];
    }
}
