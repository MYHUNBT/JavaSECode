package com.neusoft.day13;

import java.util.Calendar;

/**
 * @author liuboting
 * @date 2020/7/28 8:41
 */

public class TestCalendar {
    public static void main(String[] args) {
        // 创建calendar对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}
