package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/26 16:22
 * 数组作为方法的参数进行传递
 */

public class ArrayDemo05 {
    public static void main(String[] args) {
        sayHello("刘柏廷");
        int[] arr = {1,3,5,7,9};
        printArray(arr);
    }

    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }

   /*
     之前我们看到的方法都是基本数据类型作为参数
     使用数组作为方法的参数
     public static void printArray(形参（数据类型） 实参（变量值）){}
    */
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
