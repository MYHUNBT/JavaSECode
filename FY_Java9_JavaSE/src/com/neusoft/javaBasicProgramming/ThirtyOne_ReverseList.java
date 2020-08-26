package com.neusoft.javaBasicProgramming;

import java.util.Arrays;

/**
 * @author liuboting
 * @date 2020/8/21 19:26
 */

public class ThirtyOne_ReverseList {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseList(new int[]{1, 2, 3, 4})));
    }
    public static int[] reverseList(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
}
