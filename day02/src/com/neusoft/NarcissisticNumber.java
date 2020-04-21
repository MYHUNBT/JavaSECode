package com.neusoft;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/4/12 15:39
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = number/100;
        int b = (number - a*100)/10;
        int c = number % 10;
        if(number>=100 && number<1000){
            if(a*a*a + b*b*b + c*c*c == number){
                System.out.println(number + "是水仙花数");
            }else{
                System.out.println(number + "不是水仙花数");
            }
        }else{
            System.out.println("输入错误，必须为三位数！");
        }

    }
}
