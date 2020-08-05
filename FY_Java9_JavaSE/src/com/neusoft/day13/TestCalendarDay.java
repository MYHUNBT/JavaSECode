package com.neusoft.day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

/**
 * @author liuboting
 * @date 2020/7/28 9:24
 */

public class TestCalendarDay {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期(格式：2020-06):");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(getLastDay(s));
    }
    public static int getLastDay(String str) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        Date parse = simpleDateFormat.parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        int lastTime = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastTime;
    }
    public static int lastDay(int year,int month){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastDay;
    }
}
