package com.neusoft;
import java.util.Random;
/**
 * @author liuboting
 * @date 2020/4/19 16:53
 */
public class RandomDemo05 {
    public static void main(String[] args) {
        //创建RanDom对象
        Random random = new Random();
        //调用随机数方法
        //生成[0,num) 之间的任意整数 不包括num
        for (int i = 0; i < 10; i++) {
            int num1 = random.nextInt(1);
            System.out.println(num1);
        }
        //生成[0~1)之间任意浮点数
        double num2 = random.nextDouble();
        System.out.println(num2);
        //生成概率均等的布尔值
        boolean num3 = random.nextBoolean();
        System.out.println(num3);


    }
}
