package com.neusoft.day15;

import com.neusoft.day15.lambadaDemo.Calculator;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author liuboting
 * @date 2020/7/30 10:56
 */

public class Test {
    public static void main(String[] args) {
//        String s1 = "ab";
//        String s2 = "abc";
//        String s3 = s1 + "c";
//        System.out.println(s3 == s2);
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2018,1,14);
        calendar.set(Calendar.MONTH,1);
        calendar.get(Calendar.DAY_OF_MONTH);
        Date time = calendar.getTime();
        System.out.println(Calendar.DAY_OF_WEEK);
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(i);
//        System.out.println(time);
//        System.out.println(calendar);
//        System.out.println(date);
    }
}
