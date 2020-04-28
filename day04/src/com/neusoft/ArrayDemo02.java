package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/26 14:50
 * 两个变量指向同一个数组
 */

public class ArrayDemo02 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[3];
        //对数组进行赋值操作
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 6;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //定义数组变量arr2，将arr的地址赋给arr2
        int[] arr2 = arr;
        //修改arr2的第二个元素
        arr2[1] = 8;
        System.out.println(arr[1]);
        //遍历arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }

    }
}
