package com.neusoft.javaBasicProgramming;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/8 10:41
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 * 程序分析：关键是计算出每一项的值。
 */

public class Eight_Sum {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        System.out.println("请输入个数：");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            a += b * Math.pow(10,i);
            sum += a;
            if(i < count - 1){
                System.out.print(a + "+");
            }else {
                System.out.print(a + "=");
            }
        }
        System.out.print(sum);
    }
}
