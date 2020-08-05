package com.neusoft.day12;

/**
 * @author liuboting
 * @date 2020/7/28 8:31
 */

public class Test {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1 + "c";
        System.out.println(s3 == s2);       //false
        System.out.println(s3.equals(s2));
    }
}
