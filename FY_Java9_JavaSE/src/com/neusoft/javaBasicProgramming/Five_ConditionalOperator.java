package com.neusoft.javaBasicProgramming;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/4 14:34
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
 */

public class Five_ConditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        String grade = (score >= 90) ? "A" : (score >= 60 && score < 90) ? "B" : "C";
        System.out.println(grade);
    }
}
