package com.neusoft;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/5/10 17:29
 */

public class Test03Scanner {
    public static void main(String[] args) {
        // 匿名对象作为返回值

        System.out.println(getScanner());

    }
    public static Scanner getScanner(){
        // 普通方式scanner的返回值
//        Scanner scanner = new Scanner(System.in);
//        return scanner;

        // 匿名对象作为方法的返回值
        return new Scanner(System.in);
    }
}