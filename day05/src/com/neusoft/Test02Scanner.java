package com.neusoft;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/5/10 17:28
 */

public class Test02Scanner {
    public static void main(String[] args) {
        // 匿名对象可以作为方法的参数和返回值
        // 1 、作为参数
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
//        // 匿名对象作为方法的接收参数
        input(sc);
        input(sc2);
        input(new Scanner(System.in));

    }
    public static void input(Scanner scanner){
        System.out.println(scanner);
    }

}