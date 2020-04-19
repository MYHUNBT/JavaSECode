package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/19 16:30
 * 打印一天内所有的时间格式
 * 格式是 12时 48分
 */
public class ForForDemo04 {
    public static void main(String[] args) {
        for (int i = 0; i <= 23 ; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.print(i + "时" + j + "分\t");
            }
            System.out.println();
        }
    }
}
