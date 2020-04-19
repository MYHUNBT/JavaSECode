package com.neusoft;
import java.util.Random;
/**
 * @author liuboting
 * @date 2020/4/19 18:44
 * 生成五个十以内的随机整数
 */
public class RandomDemo11 {
    public static void main(String[] args) {
        Random random = new Random();
        int num;
        for (int i = 0; i < 5; i++) {
            num = random.nextInt(10);
            System.out.println(num);
        }
    }
}
