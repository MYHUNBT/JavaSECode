package com.neusoft.day12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liuboting
 * @date 2020/7/27 16:22
 */

public class TestDate3 {
    public static void main(String[] args) throws ParseException {
        String str = "1998年11月16日";
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = simpleDateFormat.parse(str);
        Date date1 = new Date();
        System.out.println(date);
    }
}
