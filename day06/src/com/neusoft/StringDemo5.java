package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/17 16:26
 */

public class StringDemo5 {
    public static void main(String[] args) {
        //  split(String regex) 根据给定正则表达式的匹配拆分此字符串。
        String s = "aa,bb,cc,dd";
        String[] splits = s.split(",");
        for (int i = 0; i < splits.length; i++) {
            System.out.print(splits[i] + " ");
        }
    }
}
