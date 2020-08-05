package com.neusoft.day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author liuboting
 * @date 2020/7/28 9:31
 */

public class Test {
    public static void main(String[] args) throws ParseException {
        String str = "2020-06";
        Date date = new Date();
        System.out.println(date.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        Date parse = simpleDateFormat.parse(str);


    }
}
