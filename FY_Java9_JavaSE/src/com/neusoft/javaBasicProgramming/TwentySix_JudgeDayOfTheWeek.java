package com.neusoft.javaBasicProgramming;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/19 18:46
 * Monday  Tuesday  Wednesday  Thursday  Friday  Saturday  Sunday
 */

public class TwentySix_JudgeDayOfTheWeek {
    public static void main(String[] args) {
        judgeDayOfTheWeek();
    }
    public static void judgeDayOfTheWeek(){
        System.out.println("请输入日期单词：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().toLowerCase();
        switch (s.charAt(0)){
            case 'm':
                System.out.println("星期一");
                break;
            case 't':
                if(s.charAt(1) == 'u'){
                    System.out.println("星期二");
                }else {
                    System.out.println("星期四");
                }
                break;
            case 'w':
                System.out.println("星期三");
                break;
            case 'f':
                System.out.println("星期五");
                break;
            case 's':
                if(s.charAt(1) == 'a'){
                    System.out.println("星期六");
                }else {
                    System.out.println("周末");
                }
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
