package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/17 16:33
 */

public class StringDemo6 {
    public static void main(String[] args) {
        //定义一个方法，把数组{1,2,3}按照指定的格式拼接成一个字符串
        //[word1#word2#word3]
        int[] arr = new int[]{1, 2, 3};
        String s = arrayToString(arr);
        System.out.println(s);
    }

    public static String arrayToString(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                s = s.concat("word" + arr[i] + "#");
            } else {
                s = s.concat("word" + arr[i] + "]");
            }
        }
        return s;
    }
}
