package com.neusoft;

import java.util.Scanner;

public class Text01 {
    public static void main(String[] args) {
        System.out.println("请输入1~7的一个数字：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a>7 || a<1){
            System.out.println("输入的数字必须在1~7之间");
        }else{
            if(a == 1){
                System.out.println("今天是星期一");
            }else if(a == 2){
                System.out.println("今天是星期二");
            }else if(a == 3){
                System.out.println("今天是星期三");
            }else if(a == 4){
                System.out.println("今天是星期四");
            }else if(a == 5){
                System.out.println("今天是星期五");
            }else if(a == 6){
                System.out.println("今天是星期六");
            }else if(a == 7){
                System.out.println("今天是星期七");
            }


        }

    }
}
