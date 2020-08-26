package com.neusoft.javaBasicProgramming;

/**
 * @author liuboting
 * @date 2020/8/19 18:40
 */

public class TwentyFive_Palindrome {
    public static void main(String[] args) {
        judgePalindrome(12321);
    }
    public static void judgePalindrome(int n){
        if(n%10 == n/10000 && (n%100)/10 == (n/1000)%10){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
}
