package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/26 16:54
 */

public class ArrayDemo07 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        change(a,b);
        System.out.println(a);
        System.out.println(b);

        int[] arr = {1,2,3};
        System.out.println(arr[0]);
        changeArray(arr);
        System.out.println(arr[0]);

    }

    public static void change(int a,int b){
        a = a + b;
        b = b + a;
    }

    public static  void changeArray(int[] arr){
        arr[0] = 200;
    }
}
