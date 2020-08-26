package com.neusoft.javaBasicProgramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/19 19:09
 * 题目：对10个数进行排序
 * 程序分析：可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换，
 * 下次类推，即用第二个元素与后8个进行比较，并进行交换。
 */

public class TwentyEight_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            for (int j = i; j < split.length; j++) {
                if(Integer.parseInt(split[j]) < Integer.parseInt(split[i])){
                    String temp = split[i];
                    split[i] = split[j];
                    split[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(split));
    }
}
