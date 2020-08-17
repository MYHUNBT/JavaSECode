package com.neusoft.javaBasicProgramming;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/8/9 9:08
 * 题目：一个整数，它加上100后是一个完全平方数，
 * 再加上168又是一个完全平方数，请问该数是多少？
 * 程序分析：在10万以内判断，先将该数加上100后再开方，
 * 再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。
 */

public class Thirteen_PerfectSquare {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 100000; i++) {
            if(showPerfectSquareNumber(i) != 0){
                list.add(i);
            }
        }
        System.out.println(list);

    }
    public static int showPerfectSquareNumber(int num){
        if(Math.pow((int)Math.sqrt(num+100),2) == num+100){
            if(Math.pow((int)Math.sqrt(num+268),2) == num+268){
                return num;
            }
        }
        return 0;
    }
}
