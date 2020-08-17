package com.neusoft.javaBasicProgramming;

/**
 * @author liuboting
 * @date 2020/8/15 20:23
 */

public class TwentyTwo_Recursive {
    public static void main(String[] args) {
        System.out.println(recursive(5));
    }
    public static Integer recursive(int n){
        if(n == 1){
            return 1;
        }
        return n*recursive(n-1);
    }
}
