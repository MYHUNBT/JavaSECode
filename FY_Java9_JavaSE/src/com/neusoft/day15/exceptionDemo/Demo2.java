package com.neusoft.day15.exceptionDemo;

/**
 * @author liuboting
 * @date 2020/7/30 11:24
 */

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int index = 4;
        getElement(arr,4);
    }
    public static int getElement(int[] arr,int index) {
        if(index < 0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("数组越界了");
        }
        return arr[index];
    }
}
