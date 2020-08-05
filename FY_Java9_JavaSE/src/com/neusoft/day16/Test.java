package com.neusoft.day16;

/**
 * @author liuboting
 * @date 2020/7/31 15:44
 * 2/1,3/2,5/3,8/5,13/8
 */

public class Test {
    public static void main(String[] args) {
        float[] num = new float[20 + 1];
        num[0] = 1;
        num[1] = 2;
        float sum = 2;
        for (int i = 2; i <= 20; i++) {
            num[i] = num[i-1] + num[i-2];
            sum = sum + num[i]/num[i-1];
        }
        System.out.println(sum);
    }
}
