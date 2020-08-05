package com.neusoft.day12;

import java.util.Date;

/**
 * @author liuboting
 * @date 2020/7/27 15:13
 */

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        // 创建日期对象，返回当前时间 Mon Jul 27 15:19:08 CST 2020
//        System.out.println(new Date());
//        System.out.println(new Date(0L));
//        System.out.println(time);
        System.out.println(new Date().getTime());
        int i = 0;
        while (true){
            if(i == 1000000){
                break;
            }
            i++;
        }
        System.out.println(new Date().getTime());
    }
}
