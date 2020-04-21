package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/12 16:53
 */

//求1~100的奇数和，以及奇数的个数
public class OddSum {
    public static void main(String[] args) {
        int sum = 0,count = 0;
        for(int i=1;i<=100;i++){
            if(i%2 != 0){
                sum += i;
                count++;
            }
        }
        System.out.println("1~100的奇数和为" + sum + "," + "奇数的个数为" + count);

    }
}
