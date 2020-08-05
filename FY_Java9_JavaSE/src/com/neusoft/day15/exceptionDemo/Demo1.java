package com.neusoft.day15.exceptionDemo;

/**
 * @author liuboting
 * @date 2020/7/30 11:06
 */

public class Demo1 {
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3};
//        System.out.println(ints[3]);
        if(1 == 1){
//            throw new NullPointerException("要访问的arr数组不存在");
            throw new ArrayIndexOutOfBoundsException("数组越界了");
        }
    }
}
