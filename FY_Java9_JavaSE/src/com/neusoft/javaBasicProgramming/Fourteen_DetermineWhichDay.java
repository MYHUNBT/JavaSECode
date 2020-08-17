package com.neusoft.javaBasicProgramming;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/9 9:25
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，
 * 特殊情况，闰年且输入月份大于3时需考虑多加一天。
 */

public class Fourteen_DetermineWhichDay {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入日期（yyyy-MM-dd）:");
        String line = scanner.nextLine();
        System.out.println(showDetermineWhichDay(line));

    }
    public static Integer showDetermineWhichDay(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(date);
        Calendar instance = Calendar.getInstance();
        instance.setTime(parse);
        return instance.get(Calendar.DAY_OF_YEAR);
    }
}
