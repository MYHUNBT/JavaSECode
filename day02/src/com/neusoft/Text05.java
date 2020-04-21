package com.neusoft;

import java.sql.SQLOutput;

/**
 * @author liuboting
 * @date 2020/4/12 21:02
 */
public class Text05 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=9999;i>=1000;i--){
            int ge = i%10;
            int shi = (i%100 - ge)/10;
            int bai = (i/100)%10;
            int qian = i/1000;
            if(ge + bai == shi + qian){
                count++;
                System.out.print(i+ " ");
                if(count % 5 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println("数量为" + count);
    }
}
