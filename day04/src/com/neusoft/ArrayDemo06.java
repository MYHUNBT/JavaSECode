package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/26 16:44
 * 数组作为方法的返回值
 */

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] arr = getArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int[] getArray(){
        int[] arr = {1,2,3,4,5};
        //返回数组的地址，返回给调用者
        return arr;
    }
}
