package com.neusoft.javaBasicProgramming;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/8/8 11:02
 * 题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。
 * 例如6=1＋2＋3.编程找出1000以内的所有完数。
 */

public class Nine_PerfectNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            if(i == findFactorNum(i,1)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    public static Integer findFactorNum(int num,int count){
        for (int i = count; i <= num/2; i++) {
            if(num%i == 0){
                return i + findFactorNum(num,++i);
            }
        }
        return 0;
    }
}
