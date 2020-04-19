package com.neusoft;

import java.util.Random;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/4/19 18:49
 *
 */
public class RandomDemo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name = scanner.next();
        Random random = new Random();
        int num = random.nextInt(6);
        switch (num){
            case 0:
                System.out.println("您上辈子是宰相");
                break;
            case 1:
                System.out.println("您上辈子是一品带刀侍卫");
                break;
            case 2:
                System.out.println("您上辈子是皇帝");
                break;
            case 3:
                System.out.println("您上辈子是大内总管");
                break;
            case 4:
                System.out.println("您上辈子是店小二");
                break;
            case 5:
                System.out.println("您上辈子是江湖郎中");
                break;
        }
    }
}
