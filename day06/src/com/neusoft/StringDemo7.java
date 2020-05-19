package com.neusoft;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/5/17 17:11
 */

public class StringDemo7 {
    public static void main(String[] args) {
        // 键盘录入一个字符串， 统计字符串中大小写字母及数字字符的个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = scanner.next();
        // neusoft1Neuedu3
//        getNumber(s);
        byte[] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static void getNumber(String s) {
        int hLetter = 0;
        int lLetter = 0;
        int number = 0;
        int others = 0;
        byte[] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 65 && b[i] <= 90) {
                hLetter++;
            } else if (b[i] >= 97 && b[i] <= 122) {
                lLetter++;
            } else if (b[i] >= 48 && b[i] <= 57) {
                number++;
            } else {
                others++;
            }
        }
        System.out.print("大写字母：" + hLetter + "个\n" + "小写字母：" + lLetter + "个\n" + "数字：" + number + "个\n" + "其他字符：" + others + "个\n");
    }

}

