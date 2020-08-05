package com.neusoft.day15.lambadaDemo;

/**
 * @author liuboting
 * @date 2020/7/30 16:48
 */

public class Demo5 {
    public static void main(String[] args) {
        // 使用lambda表达式
//        invokeCalc(1,2,(int a,int b)->{
//            return a + b;
//        });
        invokeCalc(1,2,(a,b)->a+b);
    }
    public static void invokeCalc(int a,int b,Calculator calculator){
        int result = calculator.calc(a, b);
        System.out.println(a + "+" + b + "=" + result);
    }
}
