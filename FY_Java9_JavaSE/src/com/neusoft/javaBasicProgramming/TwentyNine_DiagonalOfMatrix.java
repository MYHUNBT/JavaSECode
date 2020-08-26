package com.neusoft.javaBasicProgramming;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/19 19:59
 * 题目：求一个3*3矩阵对角线元素之和
 * 程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。
 */

public class TwentyNine_DiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int next = scanner.nextInt();
                arr[i][j] = next;
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
