package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/19 16:26
 */
public class BreakAndContinueDemo02 {
    //关于continue的入门案例
    //打印1~10之间，所有不是3的倍数的整数
    public static void main(String[] args) {
        for(int i =1;i <= 10; i++){
            //判断该数字是否为3的倍数
            if(i%3 == 0)
                continue;
            //如果不是3的倍数，就打印出来
            System.out.println(i);
        }
    }
}
