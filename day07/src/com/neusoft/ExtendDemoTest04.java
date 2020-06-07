package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/31 14:54
 * 成员方法不重名，调用子类和父类的方法
 */

public class ExtendDemoTest04 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
//        zi.show_Fu(); 调用父类方法
    }
}
