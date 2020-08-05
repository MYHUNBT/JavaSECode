package com.neusoft.day12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liuboting
 * @date 2020/7/27 15:57
 */

public class TestDate2 {
    public static void main(String[] args) {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
//        System.out.println(simpleDateFormat);
        Date date = new Date();
        String s1 = simpleDateFormat.format(date);
        String s = df.format(date);
        System.out.println(s);
        System.out.println(s1);

    }
}
