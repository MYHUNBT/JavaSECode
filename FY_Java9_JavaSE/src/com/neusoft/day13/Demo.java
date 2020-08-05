package com.neusoft.day13;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author liuboting
 * @date 2020/7/28 14:09
 */

public class Demo {
    public static void main(String[] args) {
        // "123" 123
        // 基本类型转换为String类型
        int a = 100;
        String b = "" + a;
        // String 类型转换为基本类型
        // 包装类都有parseXxx静态方法可以将字符串参数转换为对应的基本类型
        int i = Integer.parseInt(b);
        System.out.println(i);

    }
}
