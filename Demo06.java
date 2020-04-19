package com.neusoft;

import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/4/12 11:28
 */
public class Demo06 {
    // 条件控制
    // 单分支
//    if（要判断的条件）{
//        满足条件时要执行的事情
//    }
    public static void main(String[] args) {
//        // 定义一个时间变量 time
//        int time = 10;
//        if(time >=11 && time <= 13) {
//            System.out.println("已经中午了，要准备吃饭了");
//        }
        // 双分支
//        if(要判断的条件){
//            满足条件时要执行的事情
//        }else {
//            不满足条件时要执行的事情
//        }

//        // 定义一个时间变量 time
//        int time = 10;
//        if(time >=11 && time <= 13) {
//            System.out.println("已经中午了，要准备吃饭了");
//        }else {
//            System.out.println("还不是中午，不能吃午饭");
//        }
        // 用户在键盘输入一个整数并接收
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        // 在控制台中接收参数
        int num = sc.nextInt();
//        System.out.println("您输入的整数为"  + num);
        // 判断这个数是奇数还是偶数，并打印
        if (num %2==0){
            System.out.println(num + "是偶数");
        }else {
            System.out.println(num + "是奇数");
        }






    }






}
