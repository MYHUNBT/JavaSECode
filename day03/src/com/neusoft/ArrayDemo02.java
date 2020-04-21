package com.neusoft;

import java.util.Random;

/**
 * @author liuboting
 * @date 2020/4/19 20:53
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //求数组中最大值
        Random random = new Random();
        //创建一个12个元素的随机数组，值在1~100之间
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        //求最大值：定义最大值变量max，假设是第一个，遍历取出
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println(max);
    }
}
