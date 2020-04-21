package com.neusoft;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/4/12 22:31
 */
public class Text06 {
    public static void main(String[] args) {
        boolean flag = false;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于100的三位数:");
        int number = scanner.nextInt();
        while(flag = true) {
            if(number>999 || number<100){
                System.out.println("数字不正确，请重新输入！");
                break;
            }
            number--;
            int ge = number%10;
            int shi = (number/10)%10;
            int bai = number/100;
            if(ge!=7 && shi!=5 && bai!=3){
                sum+=number;
            }
            if(number < 100){
                System.out.println("和为" + sum);
                break;
            }
        }


    }
}
