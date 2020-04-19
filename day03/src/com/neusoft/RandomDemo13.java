package com.neusoft;

import java.util.Random;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/4/19 18:59
 * 生成一个1~100之间的随机数让用户猜大小
 */
public class RandomDemo13 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入您的数字：");
            int i = scanner.nextInt();
            if(i > num){
                System.out.println("您输入的数字大了");
            }else if(i < num){
                System.out.println("您输入的数字小了");
            }else{
                System.out.println("恭喜您猜对了！！！");
                break;
            }

        }
    }
}
