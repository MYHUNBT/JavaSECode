package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/19 9:26
 */

public class Main {
    public static void main(String[] args) {
//        String s = "abc";
//        s = s + "d";
//        System.out.println(s);
        byte[] bytes = {97,98,99};
        char[] chars = {'a','b','c'};
        String s1 = new String(bytes);
        String s2 = new String(chars);
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s4));
    }
}
