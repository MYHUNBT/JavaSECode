package com.neusoft.day13;

/**
 * @author liuboting
 * @date 2020/7/28 11:26
 */

public class TestStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("HELLO").append("WORLD").append("Java");
        String s = builder.toString();
        StringBuffer stringBuffer = new StringBuffer("dasd");

        System.out.println(s);
    }
}
