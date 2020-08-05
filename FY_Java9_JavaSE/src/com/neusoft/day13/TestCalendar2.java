package com.neusoft.day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @author liuboting
 * @date 2020/7/28 8:57
 */

public class TestCalendar2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH)+1) + "月" + calendar.get(Calendar.DAY_OF_MONTH) + "日");
        long timeInMillis = calendar.getTimeInMillis();
        System.out.println(timeInMillis);
        calendar.set(Calendar.YEAR,1970);
        calendar.set(Calendar.MONTH,0);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        Date date = calendar.getTime();
        System.out.println(date);
        int actualMaximum = calendar.getActualMaximum(8);
        System.out.println(actualMaximum);
        System.out.println(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH)+1) + "月" + calendar.get(Calendar.DAY_OF_MONTH) + "日");
    }
}
