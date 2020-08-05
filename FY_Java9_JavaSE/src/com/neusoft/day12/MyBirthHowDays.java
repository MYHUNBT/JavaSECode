package com.neusoft.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/7/27 16:31
 */

public class MyBirthHowDays {
    public static void main(String[] args) throws ParseException {
        function();
    }
    public static void function() throws ParseException {
        System.out.println("请输入出生日期(格式:yyyy-MM-dd):");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //获取出生时间对应的毫秒值
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = simpleDateFormat.parse(s); //格式转化
        long time1 = date1.getTime(); // 获取毫秒值
        //获取当前时间对应的毫秒值
        Date date2 = new Date();
        long time2 = date2.getTime();
        //相减
        System.out.println("出生了" + (time2-time1)/1000/24/60/60 + "天");
    }
}
