package com.neusoft.ADailyTopic;

import java.util.Random;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/7/30 18:37
 * 猜数字
 */

public class Day01_GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100)+1;
        while (true){
            System.out.println("请输入您猜的数字：");
            Scanner scanner = new Scanner(System.in);
            int guessNum = scanner.nextInt();
            if(guessNum == num){
                System.out.println("恭喜您猜对了！！！");
                break;
            }else if(guessNum > num){
                System.out.println("大了");
            }else {
                System.out.println("小了");
            }
        }
    }
}
