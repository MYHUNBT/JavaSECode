package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/17 16:18
 */

public class StringDemo4 {
    public static void main(String[] args) {
        String s = "abcde";
    // public char[] toCharArray() 方法，将此字符串转换为新的字符数组
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
        System.out.println(chars); // {a,b,c,d,e}
    // public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
        System.out.println();
        System.out.println(bytes);  // {97,98,99,100,101}

    // public String replace (CharSequence target, CharSequence replacement) ：将与target匹配的字符串使 用replacement字符串替换。
        String s1 = "a,b,c,d";
        s1 = s1.replace(",","|"); // "," -> "|"
        System.out.println(s1);  // "a|b|c|d"

    }
}
