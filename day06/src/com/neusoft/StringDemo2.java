package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/17 15:06
 */

public class StringDemo2 {
    public static void main(String[] args) {
        // length() 返回字符串长度 。 实际调用的是底层Length数组的属性
        String s1 = "HelloWorld";
        System.out.println(s1.length());

        //concat(String str) 将指定字符串连接到此字符串的结尾
        String s2 = s1.concat("++hello");
        System.out.println(s2);

        // charAt(int index) 返回指定索引处的char值
        char c = s1.charAt(0);
        System.out.println(c);

        // indexOf(String str)  返回指定字符串在此字符串中第一次出现的索引
        //没有返回 -1
        System.out.println(s1.indexOf("l"));

        //subString(int beginIndex,int endIndex)
        // [beginIndex,endIndex)
        //返回一个新的字符串，它是此字符串中的一个子字符串
        System.out.println(s1.substring(0,3));
    }
}
