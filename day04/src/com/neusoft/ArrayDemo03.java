package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/26 15:13
 * 求数组中最大值
 */

public class ArrayDemo03 {
    public static void main(String[] args) {
        // 创建一个数组
        int[] arr = new int[]{5,15,2000,10000,100,4000};
        //定义一个变量，存储数组中最大的值，假设第一个值最大
        int max = arr[0];
        //遍历数组，取出每一个元素，让每个元素与max比较
        for (int i = 1; i < arr.length; i++) {
            //遍历元素和 max进行比较，如果大于max，更新max的值
            if(arr[i] > max){
                max = arr[i];//max始终记录最大的值
            }
        }
        System.out.println("数组最大值:" + max);
    }
}
