package com.neusoft.javaBasicProgramming;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/8 10:08
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 程序分析：利用while语句,条件为输入的字符不为'\n'.
 */

public class Seven_NumberCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int letters = 0;
        int num = 0;
        int blankSpace = 0;
        int others = 0;
        for (int i = 0; i < chars.length; i++) {
            if((chars[i] >= 97 && chars[i] <= 122) || (chars[i] >= 65 && chars[i] <= 90)){
                letters++;
            }else if(chars[i] >= 49 && chars[i] <= 57){
                num++;
            }else if(chars[i] == ' '){
                blankSpace++;
            }else {
                others++;
            }
        }
        System.out.println(letters);
        System.out.println(num);
        System.out.println(blankSpace);
        System.out.println(others);
    }
}
