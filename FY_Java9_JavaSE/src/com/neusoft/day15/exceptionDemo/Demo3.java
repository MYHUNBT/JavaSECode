package com.neusoft.day15.exceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liuboting
 * @date 2020/7/30 11:34
 */

public class Demo3 {
    public static void main(String[] args) throws ParseException {
        String s ="2020-07-1";
        timeFormat(s);
    }
    public static void timeFormat(String s) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(s);
        System.out.println(parse);
    }
}
