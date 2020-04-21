package com.neusoft;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Text03 {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数：");
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();
        System.out.println("请输入第二个整数：");
        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner2.nextInt();
        System.out.println("请输入第三个整数：");
        Scanner scanner3 = new Scanner(System.in);
        int num3 = scanner3.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println("最大值为" + num1);
        }else if(num2>=num3){
            System.out.println("最大值为" + num2);
        }else{
            System.out.println("最大值为" + num3);
        }
    }
}
