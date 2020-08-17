package com.neusoft.javaBasicProgramming;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/9 8:38
 * 题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；
 * 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
 * 从键盘输入当月利润I，求应发放奖金总数？
 * 程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
 */

public class Twelve_Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入利润：");
        double profits = scanner.nextDouble();
        System.out.println(calculateBonus(profits));
    }
    public static double calculateBonus(double profits){
        double bonus = 0;
        if(profits <= 10){
            bonus += 0.1 * profits;
        }else if(profits > 10 && profits <= 20){
            bonus += 0.1 * profits +(profits-10) * 0.075;
        }else if(profits > 20 && profits <=40){
            bonus += 0.1 * profits +(profits-10) * 0.075 + (profits-20)*0.05;
        }else if(profits > 40 && profits <= 60){
            bonus += 0.1 * profits +(profits-10) * 0.075 + (profits-20)*0.05 +(profits-40) * 0.03;
        }else if (profits > 60 && profits <= 100){
            bonus += 0.1 * profits +(profits-10) * 0.075 + (profits-20)*0.05 +(profits-40) * 0.03 + (profits-60) * 0.015;
        }else if(profits >100){
            bonus += 0.1 * profits +(profits-10) * 0.075 + (profits-20)*0.05 +(profits-40) * 0.03 + (profits-60) * 0.015 + (profits-100) * 0.01;
        }

        return bonus;
    }
}
