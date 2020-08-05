package com.neusoft;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/7/24 8:55
 */

public class Demo02 {
    public static void main(String[] args) {
        // 键盘录入一个字符串数据，统计出大写字母，小写字母，数字的个数
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch > 'a' && ch < 'z'){
                smallCount++;
            }else if(ch > 'A' && ch < 'Z'){
                bigCount++;
            }else if(ch > '0' && ch < '9'){
                numCount++;
            }
        }
        System.out.println("大写字母：" + bigCount);
        System.out.println("小写字母：" + smallCount);
        System.out.println("数字：" + numCount);
    }
}
