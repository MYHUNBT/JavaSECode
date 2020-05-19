package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/17 14:36
 */

public class StringDemo1 {
    public static void main(String[] args) {
        // String的 equal 方法
        //创建字符串
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";

        // boolean equals(Object anObject)将此字符串与指定的对象比较
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));

        //equalsIgnoreCase() 忽略大小写，并且指定String类型
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s3));

        //扩展：大厂面试题（重点中的重点）

    }
}
