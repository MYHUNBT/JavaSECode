package com.neusoft.javaBasicProgramming;

/**
 * @author liuboting
 * @date 2020/8/11 13:12
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 * 程序分析：请抓住分子与分母的变化规律。
 */

public class Twenty_ScoreSequence {
    public static void main(String[] args) {
        System.out.println(sumScoreSequence(20));
    }
    public static double sumScoreSequence(Integer count){
        double[] ints = new double[count+1];
        ints[0] = 1;
        ints[1] = 2;
        double sum = ints[1]/ints[0];
        if(count == 1){
            return sum;
        }
        for (int i = 2; i <= count ; i++) {
            ints[i] = ints[i-1] +ints[i-2];
            sum += ints[i]/ints[i-1];
        }
        return sum;
    }
    
}
