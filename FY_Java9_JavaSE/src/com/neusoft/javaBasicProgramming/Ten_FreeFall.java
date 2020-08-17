package com.neusoft.javaBasicProgramming;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/8 13:03
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
// 100,100,50,
public class Ten_FreeFall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入高度：");
        double height = scanner.nextDouble();
        System.out.println("请输入次数：");
        int count = scanner.nextInt();
        double v = showFreeFallLength(height/2,count-1) + height;
        System.out.println(v);
    }
    public static double showFreeFallLength(double height,int count){
        if(count > 0){
            return height*2 + showFreeFallLength(height/2,--count);
        }
        return 0;
    }
}
